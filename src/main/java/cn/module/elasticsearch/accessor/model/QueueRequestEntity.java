package cn.module.elasticsearch.accessor.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/6/21.
 */
public class QueueRequestEntity implements Serializable {
    private String timestamp;
    private String topic;
    private String partition;
    private RequestBodyEntity body;

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getPartition() {
        return partition;
    }

    public void setPartition(String partition) {
        this.partition = partition;
    }

    public RequestBodyEntity getBody() {
        return body;
    }

    public void setBody(RequestBodyEntity body) {
        this.body = body;
    }
}
