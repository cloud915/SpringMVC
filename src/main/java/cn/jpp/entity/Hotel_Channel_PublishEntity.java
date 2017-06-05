package cn.jpp.entity;

public class Hotel_Channel_PublishEntity {
	
	private Long ID;
	private Long Hotel_ID;
	private String Hotel_Code;
	private Long Channel_ID;
	private String Channel_Code;
	private Long Room_Type_ID;
	private Long Rate_Plan_ID;
	private String Room_Type_Code;
	private String Rate_Plan_Code;
	//产品状态：0未上线 1上线
	private Integer Active_Status;
	private Long Create_DateTime;
	private Long Update_DateTime;
	private Integer Record_Status;
	
	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}
	public Long getHotel_ID() {
		return Hotel_ID;
	}
	public void setHotel_ID(Long hotel_ID) {
		Hotel_ID = hotel_ID;
	}
	public String getHotel_Code() {
		return Hotel_Code;
	}
	public void setHotel_Code(String hotel_Code) {
		Hotel_Code = hotel_Code;
	}
	public String getChannel_Code() {
		return Channel_Code;
	}
	public void setChannel_Code(String channel_Code) {
		Channel_Code = channel_Code;
	}
	public Long getRoom_Type_ID() {
		return Room_Type_ID;
	}
	public void setRoom_Type_ID(Long room_Type_ID) {
		Room_Type_ID = room_Type_ID;
	}
	public Long getRate_Plan_ID() {
		return Rate_Plan_ID;
	}
	public void setRate_Plan_ID(Long rate_Plan_ID) {
		Rate_Plan_ID = rate_Plan_ID;
	}
	public String getRoom_Type_Code() {
		return Room_Type_Code;
	}
	public void setRoom_Type_Code(String room_Type_Code) {
		Room_Type_Code = room_Type_Code;
	}
	public String getRate_Plan_Code() {
		return Rate_Plan_Code;
	}
	public void setRate_Plan_Code(String rate_Plan_Code) {
		Rate_Plan_Code = rate_Plan_Code;
	}

	public Integer getActive_Status() {
		return Active_Status;
	}

	public void setActive_Status(Integer active_Status) {
		Active_Status = active_Status;
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

	public Long getChannel_ID() {
		return Channel_ID;
	}

	public void setChannel_ID(Long channel_ID) {
		Channel_ID = channel_ID;
	}
}
