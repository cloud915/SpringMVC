package cn.jpp.entity;

public class Hotel_Rate_PlanEntity {
	
	private Long ID;
	private Long Hotel_ID;
	private String Hotel_Code;
	private String Rate_Plan_Code;
	private String Rate_Plan_Name;
	private Integer Includes_Breakfast_Count;
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
	public String getRate_Plan_Code() {
		return Rate_Plan_Code;
	}
	public void setRate_Plan_Code(String rate_Plan_Code) {
		Rate_Plan_Code = rate_Plan_Code;
	}
	public String getRate_Plan_Name() {
		return Rate_Plan_Name;
	}
	public void setRate_Plan_Name(String rate_Plan_Name) {
		Rate_Plan_Name = rate_Plan_Name;
	}
	public Integer getIncludes_Breakfast_Count() {
		return Includes_Breakfast_Count;
	}
	public void setIncludes_Breakfast_Count(Integer includes_Breakfast_Count) {
		Includes_Breakfast_Count = includes_Breakfast_Count;
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
