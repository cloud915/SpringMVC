package cn.jpp.entity;

public class Hotel_Room_TypeEntity {
	
	private Long ID;
	private Long Hotel_ID;
	private String Hotel_Code;
	private String Room_Type_Code;
	private String Room_Type_Name;
	private Integer Room_Person_Count;
	private String Description;
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
	public String getRoom_Type_Code() {
		return Room_Type_Code;
	}
	public void setRoom_Type_Code(String room_Type_Code) {
		Room_Type_Code = room_Type_Code;
	}
	public String getRoom_Type_Name() {
		return Room_Type_Name;
	}
	public void setRoom_Type_Name(String room_Type_Name) {
		Room_Type_Name = room_Type_Name;
	}
	public Integer getRoom_Person_Count() {
		return Room_Person_Count;
	}
	public void setRoom_Person_Count(Integer room_Person_Count) {
		Room_Person_Count = room_Person_Count;
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
	
}
