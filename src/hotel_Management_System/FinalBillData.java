package hotel_Management_System;

import java.io.Serializable;



public class FinalBillData implements Serializable

{
	private String gstnme;
	private String romno;
	private String chkindte;
	private String chkoutdte;
	private String htelchrge;
	private String extrachrge;
	private String restcharge;
	private String total;
	private String paid;
	
	
	public String getPaid() {
		return paid;
	}
	public void setPaid(String paid) {
		this.paid = paid;
	}
	public String getGstnme() {
		return gstnme;
	}
	public void setGstnme(String gstnme) {
		this.gstnme = gstnme;
	}
	public String getRomno() {
		return romno;
	}
	public void setRomno(String romno) {
		this.romno = romno;
	}
	public String getChkindte() {
		return chkindte;
	}
	public void setChkindte(String chkindte) {
		this.chkindte = chkindte;
	}
	public String getChkoutdte() {
		return chkoutdte;
	}
	public void setChkoutdte(String chkoutdte) {
		this.chkoutdte = chkoutdte;
	}
	public String getHtelchrge() {
		return htelchrge;
	}
	public void setHtelchrge(String htelchrge) {
		this.htelchrge = htelchrge;
	}
	public String getExtrachrge() {
		return extrachrge;
	}
	public void setExtrachrge(String extrachrge) {
		this.extrachrge = extrachrge;
	}
	public String getRestcharge() {
		return restcharge;
	}
	public void setRestcharge(String restcharge) {
		this.restcharge = restcharge;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	
	

}
