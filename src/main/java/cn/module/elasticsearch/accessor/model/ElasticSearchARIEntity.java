package cn.module.elasticsearch.accessor.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/5/11.
 */
public class ElasticSearchARIEntity implements Serializable {
    private String activeDate;
    private String lastPushDate;

    public String getActiveDate() {
        return activeDate;
    }

    public void setActiveDate(String activeDate) {
        this.activeDate = activeDate;
    }

    public String getLastPushDate() {
        return lastPushDate;
    }

    public void setLastPushDate(String lastPushDate) {
        this.lastPushDate = lastPushDate;
    }

}
