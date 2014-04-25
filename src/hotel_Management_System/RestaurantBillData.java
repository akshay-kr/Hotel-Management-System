package hotel_Management_System;

import java.io.Serializable;

public class RestaurantBillData implements Serializable
{
	
	private String guestname;
	private String roomnumbr;
	private String restaurantbill;
	public String getGuestname() {
		return guestname;
	}
	public void setGuestname(String guestname) {
		this.guestname = guestname;
	}
	public String getRoomnumbr() {
		return roomnumbr;
	}
	public void setRoomnumbr(String roomnumbr) {
		this.roomnumbr = roomnumbr;
	}
	public String getRestaurantbill() {
		return restaurantbill;
	}
	public void setRestaurantbill(String restaurantbill) {
		this.restaurantbill = restaurantbill;
	}
	
	

}
