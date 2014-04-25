package hotel_Management_System;

import java.io.Serializable;


public class LoginData implements Serializable 
{
	private String staffname;
	private String staffaddress;
	private String staffcontact;
	private String id;
	private String pass;
	private String post;
	private String gender;
	private String emailid;
	private String dojth;
	
	public String getStaffname() {
		return staffname;
	}
	public void setStaffname(String staffname) {
		this.staffname = staffname;
	}
	public String getStaffaddress() {
		return staffaddress;
	}
	public void setStaffaddress(String staffaddress) {
		this.staffaddress = staffaddress;
	}
	public String getStaffcontact() {
		return staffcontact;
	}
	public void setStaffcontact(String staffcontact) {
		this.staffcontact = staffcontact;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getDojth() {
		return dojth;
	}
	public void setDojth(String dojth) {
		this.dojth = dojth;
	}
	
	
	
	
}