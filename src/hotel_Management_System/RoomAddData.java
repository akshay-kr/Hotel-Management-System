package hotel_Management_System;

import java.io.Serializable;


public class RoomAddData implements Serializable

{

	private String roomno;
	private String roomtypes;
	private String roomcapacity;
	private String roomfare;
	private String avaibility;
	
	
	public String getRoomno() {
		return roomno;
	}
	public void setRoomno(String roomno) {
		this.roomno = roomno;
	}
	public String getRoomtypes() {
		return roomtypes;
	}
	public void setRoomtypes(String roomtypes) {
		this.roomtypes = roomtypes;
	}
	public String getRoomcapacity() {
		return roomcapacity;
	}
	public void setRoomcapacity(String roomcapacity) {
		this.roomcapacity = roomcapacity;
	}
	public String getRoomfare() {
		return roomfare;
	}
	public void setRoomfare(String roomfare) {
		this.roomfare = roomfare;
	}
	public String getAvaibility() {
		return avaibility;
	}
	public void setAvaibility(String avaibility) {
		this.avaibility = avaibility;
	}
	
	
	
}


