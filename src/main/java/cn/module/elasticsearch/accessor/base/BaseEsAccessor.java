package cn.module.elasticsearch.accessor.base;

import cn.common.utils.ConfigUtil;
import cn.common.utils.CustomProperties;
import cn.common.utils.DateTimeUtil;
import cn.module.elasticsearch.accessor.model.ElasticSearchARIEntity;
import cn.module.elasticsearch.factory.ElasticFactory;
import cn.module.elasticsearch.util.Constants;
import com.alibaba.fastjson.JSON;
import org.elasticsearch.action.admin.indices.delete.DeleteIndexResponse;
import org.elasticsearch.action.admin.indices.exists.indices.IndicesExistsAction;
import org.elasticsearch.action.admin.indices.exists.indices.IndicesExistsRequest;
import org.elasticsearch.action.admin.indices.exists.indices.IndicesExistsRequestBuilder;
import org.elasticsearch.action.admin.indices.exists.indices.IndicesExistsResponse;
import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.get.MultiGetItemResponse;
import org.elasticsearch.action.get.MultiGetResponse;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.action.update.UpdateResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.index.engine.VersionConflictEngineException;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.*;
import org.elasticsearch.search.SearchHit;

import java.util.*;

public class BaseEsAccessor extends AbstractEsAccessor<String, String, Long> {
    //private static NormalLog logger = NormalLog.getInstance();

    protected Client client;
    protected CustomProperties prop;

    Boolean esRetryOpenLog = false;
    Integer esRetryTimes = 200;
    Long esRetryInterval = 0l;

    public BaseEsAccessor(Client client, String esConfigFile) {
        this.client = client;
        prop = ConfigUtil.getProperties(esConfigFile);
        esRetryOpenLog = prop.getBoolean("elasticsearch.RetryOpenLog");
        esRetryTimes = prop.getInt("elasticsearch.RetryTimes");
        esRetryInterval = prop.getLong("elasticsearch.RetryInterval");

    }

    @Override
    protected Boolean indexExistObj(String index) {
        IndicesExistsRequest request = new IndicesExistsRequestBuilder(client.admin().indices(), IndicesExistsAction.INSTANCE, index).request();
        IndicesExistsResponse response = client.admin().indices().exists(request).actionGet();
        return response.isExists();
    }

    @Override
    protected void indexDeleteObj(String index) {
        DeleteIndexResponse deleteIndexResponse = client.admin().indices().prepareDelete(index).execute().actionGet();
        //return deleteIndexResponse.get
    }

    @Override
    protected String indexObj(String index, String documentType, String entity) {
        //String json = convertEntityToJson(entity);
        IndexResponse response = client.prepareIndex(index, documentType).setSource(entity).get();

        // Version (if it's the first time you index this document, you will get: 1)
        long _version = response.getVersion();
        // isCreated() is true if the document is a new one, false if it has been updated
        boolean created = response.isCreated();

        return response.getId();
    }


    @Override
    protected String updateObj(String index, String documentType, Long version, String key, String entity, HashMap<String, String> searchMap, Long compareValue) {
        //String json = convertEntityToJson(entity);
        Boolean needRetry = false;
        UpdateResponse response;
        try {
            response = client.prepareUpdate(index, documentType, key)
                    .setVersion(version)
                    .setDoc(entity)
                    .get();
            needRetry = false;
        } catch (VersionConflictEngineException vEx) {
            needRetry = true;
            if (true == esRetryOpenLog) {
                //logger.error("[error] es updateObj is exception,_type=" + documentType + ",version=" + version, vEx);
            }
        }
        if (esRetryTimes == null) {
            esRetryTimes = 5;
        }
        if (esRetryInterval == null) {
            esRetryInterval = 20l;
        }
        Integer sequence = 0;
        while (needRetry == true) {

            if (sequence == esRetryTimes) {
                return "failed";
            }
            sequence++;

            SearchRequestBuilder searchRequestBuilder = client.prepareSearch(index)
                    .setTypes(documentType)
                    .setVersion(true)
                    .setSearchType(SearchType.DFS_QUERY_THEN_FETCH)
                    .setFrom(0).setSize(5)
                    .setExplain(true);

            BoolQueryBuilder queryBuilder = QueryBuilders.boolQuery();
            Iterator iter = searchMap.entrySet().iterator();
            while (iter.hasNext()) {
                Map.Entry entry = (Map.Entry) iter.next();
                String searchKey = (String) entry.getKey();
                String searchValue = (String) entry.getValue();

                if (!"".equals(key) && !"".equals(searchValue)) {
                    queryBuilder.must(QueryBuilders.queryStringQuery(searchValue).field(searchKey));
                }

                searchRequestBuilder.setQuery(QueryBuilders.matchAllQuery());
                searchRequestBuilder.setQuery(queryBuilder);
            }
            SearchResponse searchResponse = searchRequestBuilder.execute().actionGet();

            try {
                if (searchResponse.getHits().totalHits() > 0) {

                    String remortString = searchResponse.getHits().getAt(0).getSourceAsString();
                    ElasticSearchARIEntity remortEntity = JSON.parseObject(remortString, ElasticSearchARIEntity.class);
                    Long remortLastPushDate = Long.parseLong(remortEntity.getLastPushDate());

                    if ((compareValue < remortLastPushDate)) {
                        if (true == esRetryOpenLog)
                            //logger.error("[stop] es updateObj retry,_type=" + documentType + ",retry time=" + sequence + ",version=" + searchResponse.getHits().getAt(0).getVersion());
                            needRetry = false;
                        return "skip";
                    }
                    response = client.prepareUpdate(index, documentType, key)
                            .setVersion(searchResponse.getHits().getAt(0).getVersion())
                            .setDoc(entity).get();
                    needRetry = false;
                    if (true == esRetryOpenLog) {
                        //logger.error("[success] es updateObj retry is success,_type=" + documentType + ",retry time=" + sequence + ",version=" + searchResponse.getHits().getAt(0).getVersion());
                    }
                } else {
                    break;
                }
            } catch (VersionConflictEngineException vEx) {
                needRetry = true;
                if (true == esRetryOpenLog)
                    //logger.error("[error] es updateObj retry is exception,_type=" + documentType + ",retry time=" + sequence + ",version=" + searchResponse.getHits().getAt(0).getVersion(), vEx);
                    try {
                        Thread.sleep(esRetryInterval);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
            }

        }
        return "success";
    }

    @Override
    protected String deleteObj(String index, String documentType, String key) {
        DeleteResponse response = client.prepareDelete(index, documentType, key).get();
        return response.getId();
    }

    @Override
    protected String getObj(String index, String documentType, String key) {
        GetResponse response = client.prepareGet(index, documentType, key).get();
        return response.getSourceAsString();
    }

    @Override
    protected List<String> multiGetObj(String index, String documentType, String... keys) {
        MultiGetResponse multiGetItemResponses = client.prepareMultiGet()
                .add(index, documentType, keys).get();
        List<String> list = new ArrayList();
        for (MultiGetItemResponse itemResponse : multiGetItemResponses) {
            GetResponse response = itemResponse.getResponse();
            if (response.isExists()) {
                //R entity = convertJsonToEntity(response.getSourceAsString());
                list.add(response.getSourceAsString());
            }
        }
        return list;
    }

    @Override
    protected HashMap<String, String> searchObj(String index, String documentType, Map<String, String> searchMap, int from, int size) {
        SearchRequestBuilder searchRequestBuilder = client.prepareSearch(index)
                .setTypes(documentType)
                .setVersion(true)
                .setSearchType(SearchType.DFS_QUERY_THEN_FETCH)
                .setFrom(from).setSize(size)
                .setExplain(true);

        HashMap<String, String> hashMap = new HashMap<String, String>();

        BoolQueryBuilder queryBuilder = QueryBuilders.boolQuery();
        Iterator iter = searchMap.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            String key = (String) entry.getKey();
            String value = (String) entry.getValue();

            if (!"".equals(key) && !"".equals(value)) {
                queryBuilder.must(QueryBuilders.queryStringQuery(value).field(key));
                //queryBuilder.must(QueryBuilders.termQuery(key, value));

            }
        }

        searchRequestBuilder.setQuery(QueryBuilders.matchAllQuery());
        searchRequestBuilder.setQuery(queryBuilder);
        SearchResponse response = searchRequestBuilder.execute().actionGet();

        for (SearchHit hit : response.getHits()) {
            if (!hit.isSourceEmpty()) {
                //R entity = convertJsonToEntity(hit.getSourceAsString());
                hashMap.put(hit.getId() + ":" + hit.getVersion(), hit.getSourceAsString());
            }
        }
        return hashMap;
    }

    @Override
    protected HashMap<String, String> searchObjRange(String index, String documentType, Map<String, String> searchMap, int from, int size, RangeQueryBuilder rangeQueryBuilder) {
        SearchRequestBuilder searchRequestBuilder = client.prepareSearch(index)
                .setTypes(documentType)
                .setVersion(true)
                .setSearchType(SearchType.DFS_QUERY_THEN_FETCH)
                .setFrom(from).setSize(size)
                .setExplain(true);

        HashMap<String, String> hashMap = new HashMap<String, String>();

        BoolQueryBuilder queryBuilder = QueryBuilders.boolQuery();
        Iterator iter = searchMap.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            String key = (String) entry.getKey();
            String value = (String) entry.getValue();

            if (!"".equals(key) && !"".equals(value)) {
                queryBuilder.must(QueryBuilders.queryStringQuery(value).field(key));
                //queryBuilder.must(QueryBuilders.termQuery(key, value));

            }
        }

        searchRequestBuilder.setQuery(QueryBuilders.matchAllQuery());
        if (null != rangeQueryBuilder) {
            queryBuilder.filter(rangeQueryBuilder);
        }
        searchRequestBuilder.setQuery(queryBuilder);

        SearchResponse response = searchRequestBuilder.execute().actionGet();

        for (SearchHit hit : response.getHits()) {
            if (!hit.isSourceEmpty()) {
                //R entity = convertJsonToEntity(hit.getSourceAsString());
                hashMap.put(hit.getId() + ":" + hit.getVersion(), hit.getSourceAsString());
            }
        }
        return hashMap;
    }

}