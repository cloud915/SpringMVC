package cn.jpp.entity;

public class SSP_HotelEntity {

    private Long ID;
    private String Hotel_Code;
    private String Hotel_Name;
    private String Domain_Code;
    private String Domain_Name;
    private String Pms_Code;
    private String Pms_Name;
    private String Hotel_Address;
    private String Description;
    private Long Create_DateTime;
    private Long Update_DateTime;
    private Integer Record_Status;
    //酒店状态，1上线 0下线
    private Integer Active_Status;
    //下线原因
    private String Offline_Cause;

    private String Hotel_City;

    private String Hotel_Tel;

    private String Hotel_Email;


    public Long getID() {
        return ID;
    }

    public void setID(Long iD) {
        ID = iD;
    }

    public String getHotel_Code() {
        return Hotel_Code;
    }

    public void setHotel_Code(String hotel_Code) {
        Hotel_Code = hotel_Code;
    }

    public String getHotel_Name() {
        return Hotel_Name;
    }

    public void setHotel_Name(String hotel_Name) {
        Hotel_Name = hotel_Name;
    }

    public String getDomain_Code() {
        return Domain_Code;
    }

    public void setDomain_Code(String domain_Code) {
        Domain_Code = domain_Code;
    }

    public String getPms_Code() {
        return Pms_Code;
    }

    public void setPms_Code(String pms_Code) {
        Pms_Code = pms_Code;
    }

    public String getPms_Name() {
        return Pms_Name;
    }

    public void setPms_Name(String pms_Name) {
        Pms_Name = pms_Name;
    }

    public String getHotel_Address() {
        return Hotel_Address;
    }

    public void setHotel_Address(String hotel_Address) {
        Hotel_Address = hotel_Address;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Long getCreate_DateTime() {
        return Create_DateTime;
    }

    public void setCreate_DateTime(Long create_DateTime) {
        Create_DateTime = create_DateTime;
    }

    public Long getUpdate_DateTime() {
        return Update_DateTime;
    }

    public void setUpdate_DateTime(Long update_DateTime) {
        Update_DateTime = update_DateTime;
    }

    public Integer getRecord_Status() {
        return Record_Status;
    }

    public void setRecord_Status(Integer record_Status) {
        Record_Status = record_Status;
    }

    public String getDomain_Name() {
        return Domain_Name;
    }

    public void setDomain_Name(String domain_Name) {
        Domain_Name = domain_Name;
    }

    public Integer getActive_Status() {
        return Active_Status;
    }

    public void setActive_Status(Integer active_Status) {
        Active_Status = active_Status;
    }

    public String getOffline_Cause() {
        return Offline_Cause;
    }

    public void setOffline_Cause(String offline_Cause) {
        Offline_Cause = offline_Cause;
    }

    public String getHotel_Tel() {
        return Hotel_Tel;
    }

    public void setHotel_Tel(String hotel_Tel) {
        Hotel_Tel = hotel_Tel;
    }

    public String getHotel_City() {
        return Hotel_City;
    }

    public void setHotel_City(String hotel_City) {
        Hotel_City = hotel_City;
    }

    public String getHotel_Email() {
        return Hotel_Email;
    }

    public void setHotel_Email(String hotel_Email) {
        Hotel_Email = hotel_Email;
    }
}
