package cn.jpp.entity.qdb;

/**
 * Created by Administrator on 2017/6/13.
 */
public class SSP_AvailabilitysQueryRq {
    public SSP_AvailabilitysQueryRq(){

    }
    public SSP_AvailabilitysQueryRq(String pms_Code, String hotel_Code, String room_Type_Code, String rate_Plan_Code, Long active_DateTime, Long check_Avail_DateTime) {
        this.pms_Code = pms_Code;
        this.hotel_Code = hotel_Code;
        this.room_Type_Code = room_Type_Code;
        this.rate_Plan_Code = rate_Plan_Code;
        this.active_DateTime = active_DateTime;
        this.check_Avail_DateTime = check_Avail_DateTime;
    }

    private String pms_Code;
    private String hotel_Code;
    private String room_Type_Code;
    private String rate_Plan_Code;
    private Long active_DateTime;
    private Long check_Avail_DateTime;

    private String Room_Status_B;
    private Long Processed_DataTime_B;

    private String Room_Status_A;
    private Long Processed_DataTime_A;

    private String Room_Status_L;
    private Long Processed_DataTime_L;

    public String getPms_Code() {
        return pms_Code;
    }

    public void setPms_Code(String pms_Code) {
        this.pms_Code = pms_Code;
    }

    public String getHotel_Code() {
        return hotel_Code;
    }

    public void setHotel_Code(String hotel_Code) {
        this.hotel_Code = hotel_Code;
    }

    public String getRoom_Type_Code() {
        return room_Type_Code;
    }

    public void setRoom_Type_Code(String room_Type_Code) {
        this.room_Type_Code = room_Type_Code;
    }

    public String getRate_Plan_Code() {
        return rate_Plan_Code;
    }

    public void setRate_Plan_Code(String rate_Plan_Code) {
        this.rate_Plan_Code = rate_Plan_Code;
    }

    public Long getActive_DateTime() {
        return active_DateTime;
    }

    public void setActive_DateTime(Long active_DateTime) {
        this.active_DateTime = active_DateTime;
    }

    public Long getCheck_Avail_DateTime() {
        return check_Avail_DateTime;
    }

    public void setCheck_Avail_DateTime(Long check_Avail_DateTime) {
        this.check_Avail_DateTime = check_Avail_DateTime;
    }

    public String getRoom_Status_B() {
        return Room_Status_B;
    }

    public void setRoom_Status_B(String room_Status_B) {
        Room_Status_B = room_Status_B;
    }

    public Long getProcessed_DataTime_B() {
        return Processed_DataTime_B;
    }

    public void setProcessed_DataTime_B(Long processed_DataTime_B) {
        Processed_DataTime_B = processed_DataTime_B;
    }

    public String getRoom_Status_A() {
        return Room_Status_A;
    }

    public void setRoom_Status_A(String room_Status_A) {
        Room_Status_A = room_Status_A;
    }

    public Long getProcessed_DataTime_A() {
        return Processed_DataTime_A;
    }

    public void setProcessed_DataTime_A(Long processed_DataTime_A) {
        Processed_DataTime_A = processed_DataTime_A;
    }

    public String getRoom_Status_L() {
        return Room_Status_L;
    }

    public void setRoom_Status_L(String room_Status_L) {
        Room_Status_L = room_Status_L;
    }

    public Long getProcessed_DataTime_L() {
        return Processed_DataTime_L;
    }

    public void setProcessed_DataTime_L(Long processed_DataTime_L) {
        Processed_DataTime_L = processed_DataTime_L;
    }
}
