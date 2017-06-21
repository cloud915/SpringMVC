package cn.module.elasticsearch.accessor.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/6/21.
 */
public class RequestBodyEntity implements Serializable {
    private Long requestTime;
    private String requestMessage;
    private String requestLogType;
    private String requestMark;
    private String appName;
    private String serverIP;
    private String logTime;

    public Long getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Long requestTime) {
        this.requestTime = requestTime;
    }

    public String getRequestMessage() {
        return requestMessage;
    }

    public void setRequestMessage(String requestMessage) {
        this.requestMessage = requestMessage;
    }

    public String getRequestLogType() {
        return requestLogType;
    }

    public void setRequestLogType(String requestLogType) {
        this.requestLogType = requestLogType;
    }

    public String getRequestMark() {
        return requestMark;
    }

    public void setRequestMark(String requestMark) {
        this.requestMark = requestMark;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getServerIP() {
        return serverIP;
    }

    public void setServerIP(String serverIP) {
        this.serverIP = serverIP;
    }

    public String getLogTime() {
        return logTime;
    }

    public void setLogTime(String logTime) {
        this.logTime = logTime;
    }
}
