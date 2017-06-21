package cn.module.elasticsearch.accessor.base;


import cn.module.cache.FileIndexAccessor;
import cn.module.elasticsearch.factory.ElasticFactory;
import cn.module.elasticsearch.util.Constants;
import org.elasticsearch.index.query.RangeQueryBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractEsAccessor<R, T, K> implements FileIndexAccessor<R, T, K> {
    protected abstract Boolean indexExistObj(String index);

    protected abstract void indexDeleteObj(String index);

    protected abstract String indexObj(String index, String documentType, String entity);

    protected abstract String updateObj(String index, String documentType, Long version, String key, String entity, HashMap<String, String> searchMap, K compareValue);

    protected abstract String deleteObj(String index, String documentType, String key);

    protected abstract String getObj(String index, String documentType, String key);

    protected abstract List<String> multiGetObj(String index, String documentType, String... keys);

    protected abstract HashMap<String, String> searchObj(String index, String documentType, Map<String, String> searchMap, int from, int size);

    protected abstract HashMap<String, String> searchObjRange(String index, String documentType, Map<String, String> searchMap, int from, int size, RangeQueryBuilder rangeQueryBuilder);

    public R indexExist(String index) {
        return (R) indexExistObj(index);
    }

    public void indexDelete(String index) {
        indexDeleteObj(index);
    }

    public R index(String index, String documentType, T entity) {
        return (R) indexObj(index, documentType, (String) entity);
    }

    public R update(String index, String documentType, Long version, String key, T entity, HashMap<String, String> searchMap, K compareValue) {
        return (R) updateObj(index, documentType, version, key, (String) entity, searchMap, compareValue);
    }

    public R delete(String index, String documentType, String key) {
        return (R) deleteObj(index, documentType, key);
    }

    public R get(String index, String documentType, String key) {
        return (R) getObj(index, documentType, key);
    }

    public R multiGet(String index, String documentType, String... keys) {
        return (R) multiGetObj(index, documentType, keys);
    }

    public HashMap<R, R> search(String index, String documentType, Map<String, String> searchMap, int from, int size) {

        if (searchMap == null)
            throw new IllegalArgumentException("searchMap must be not null");
        if (searchMap.size() == 0)
            throw new IllegalArgumentException("searchMap size must be great than 0");

        if (from < 0) from = 0;
        if (size <= 0) size = 1;

        return (HashMap<R, R>) searchObj(index, documentType, searchMap, from, size);
    }

    public HashMap<R, R> searchRange(String index, String documentType, Map<String, String> searchMap, int from, int size, String timeField, Long beginDate) {

        if (searchMap == null)
            throw new IllegalArgumentException("searchMap must be not null");
        if (searchMap.size() == 0)
            throw new IllegalArgumentException("searchMap size must be great than 0");

        if (from < 0) from = 0;
        if (size <= 0) size = 1;
        RangeQueryBuilder rangeQueryBuilder = initQueryBuilder(timeField, beginDate, System.currentTimeMillis());
        return (HashMap<R, R>) searchObjRange(index, documentType, searchMap, from, size, rangeQueryBuilder);
    }

    public RangeQueryBuilder initQueryBuilder(String timeField, Long beginDate, Long endDate) {
        RangeQueryBuilder rangeQueryBuilder = null;
        if (timeField != null && timeField.trim().length() > 0) {
            rangeQueryBuilder = (RangeQueryBuilder) ElasticFactory.buildRangeQuery(
                    timeField,
                    beginDate,
                    endDate,
                    //DateTimeUtil.format(beginDate, Constants.ES_TIME_FORMAT),
                    //DateTimeUtil.format(endDate, Constants.ES_TIME_FORMAT),
                    null,
                    Constants.SYMBOL_LT);
        }
        return rangeQueryBuilder;
    }

}