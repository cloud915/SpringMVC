package cn.jpp.entity.qdb;

/**
 * Created by Administrator on 2017/6/13.
 */
public class SSP_AvailabilitysQueryRs {
    private String Room_Status;
    private Long processed_datetime;

    public String getRoom_Status() {
        return Room_Status;
    }

    public void setRoom_Status(String room_Status) {
        Room_Status = room_Status;
    }

    public Long getProcessed_datetime() {
        return processed_datetime;
    }

    public void setProcessed_datetime(Long processed_datetime) {
        this.processed_datetime = processed_datetime;
    }
}
