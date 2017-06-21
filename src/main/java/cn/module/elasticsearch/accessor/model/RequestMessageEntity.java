package cn.module.elasticsearch.accessor.model;

/**
 * Created by Administrator on 2017/6/21.
 */
public class RequestMessageEntity {
    private String message;
    private String type;
    private String hotelCode;
    private String roomTypeCode;
    private String ratePlanCode;
    private Long requestTime;
    private String ariType;

    public String getAriType() {
        return ariType;
    }

    public void setAriType(String ariType) {
        this.ariType = ariType;
    }

    public Long getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Long requestTime) {
        this.requestTime = requestTime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHotelCode() {
        return hotelCode;
    }

    public void setHotelCode(String hotelCode) {
        this.hotelCode = hotelCode;
    }

    public String getRoomTypeCode() {
        return roomTypeCode;
    }

    public void setRoomTypeCode(String roomTypeCode) {
        this.roomTypeCode = roomTypeCode;
    }

    public String getRatePlanCode() {
        return ratePlanCode;
    }

    public void setRatePlanCode(String ratePlanCode) {
        this.ratePlanCode = ratePlanCode;
    }
}
