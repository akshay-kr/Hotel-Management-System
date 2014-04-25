package hotel_Management_System;

import java.io.Serializable;

public class RestaurantMenuAddData implements Serializable
{

	private String itemname;
	private String itemid;
	private String itemcategory;
	private String itemsubcategory;
	private String itemprice;
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public String getItemid() {
		return itemid;
	}
	public void setItemid(String itemid) {
		this.itemid = itemid;
	}
	public String getItemcategory() {
		return itemcategory;
	}
	public void setItemcategory(String itemcategory) {
		this.itemcategory = itemcategory;
	}
	public String getItemsubcategory() {
		return itemsubcategory;
	}
	public void setItemsubcategory(String itemsubcategory) {
		this.itemsubcategory = itemsubcategory;
	}
	public String getItemprice() {
		return itemprice;
	}
	public void setItemprice(String itemprice) {
		this.itemprice = itemprice;
	}
	
	
	
}
