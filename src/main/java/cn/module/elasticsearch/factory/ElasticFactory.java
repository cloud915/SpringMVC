package cn.module.elasticsearch.factory;


import cn.module.elasticsearch.util.Constants;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * Created by Administrator on 2016/5/11.
 */
public class ElasticFactory {

    /**
     * metrics  index
     *
     * @param boundType
     * @param suffixDate
     * @return
     */
    public static String initIndexName(String boundType, String suffixDate) {
        return String.format("v2-%s-metric-%s", boundType, suffixDate);
    }

    /**
     * 范围查询
     * 当前字段范围查询，默认包含上下界
     *
     * @param conColumn  待查询列名
     * @param min        下界
     * @param max        上界
     * @param includeMin 与下界的关系   >, >=
     * @param includeMax 与上界的关系   <, <=
     * @return
     */
    public static QueryBuilder buildRangeQuery(String conColumn, Long min, Long max, String includeMin, String includeMax) {
        boolean minflag = true;
        boolean maxflag = true;
        if (includeMin != null && includeMin.equals(Constants.SYMBOL_GT)) {
            minflag = false;
        }
        if (includeMax != null && includeMax.equals(Constants.SYMBOL_LT)) {
            maxflag = false;
        }
        QueryBuilder queryBuilder = QueryBuilders.rangeQuery(conColumn).from(min).to(max).includeLower(minflag).includeUpper(maxflag);
        return queryBuilder;
    }
}
