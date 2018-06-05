package com.ts.rest.Restfulapi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Donate {
	private String dis_name;
	private String med_name;
	private String med_type;
	private String exp_date;
	private String dosage;
	private String quantity;
	

	public Donate() {
		super();
	}
	public Donate(String dis_name,String med_name,String med_type,String exp_date, String dosage,String quantity) {
		super();
		
		this.dis_name = dis_name;
		this.med_name=med_name;
		this.med_type=med_type;
		this.exp_date=exp_date;
		this.dosage=dosage;
		this.quantity=quantity;
	
	}


	public String getDis_name() {
		return dis_name;
	}

	@XmlElement
	public void setDis_name(String dis_name) {
		this.dis_name = dis_name;
	}


	public String getMed_name() {
		return med_name;
	}

	@XmlElement
	public void setMed_name(String med_name) {
		this.med_name = med_name;
	}


	public String getMed_type() {
		return med_type;
	}

	@XmlElement
	public void setMed_type(String med_type) {
		this.med_type = med_type;
	}


	public String getExp_date() {
		return exp_date;
	}

	@XmlElement
	public void setExp_date(String exp_date) {
		this.exp_date = exp_date;
	}


	public String getDosage() {
		return dosage;
	}

	@XmlElement
	public void setDosage(String dosage) {
		this.dosage = dosage;
	}


	public String getQuantity() {
		return quantity;
	}

	@XmlElement
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

}
