package com.ts.rest.Restfulapi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Receivedetails {
		  private String patient_name;
		  private String patient_phone;
		  private String patient_address;
		  private String req_quantity;
		  public Receivedetails(){
		         super();
		     }
		  public Receivedetails(String patient_name,String patient_phone,String patient_address,String req_quantity){
			  super();
                 this.patient_name = patient_name;
		         this.patient_phone = patient_phone;
		         this.patient_address = patient_address;
		         this.req_quantity = req_quantity;
		     }
		    public String getPatient_name() {
		        return patient_name;
		    }
			@XmlElement
		    public void setPatient_name(String patient_name) {
		        this.patient_name = patient_name;
		    }
		    public String getPatient_phone() {
		        return patient_phone;
		    }
			@XmlElement
		    public void setPatient_phone(String patient_phone) {
		        this.patient_phone = patient_phone;
		    }
		    public String getPatient_address() {
		        return patient_address;
		    }
			@XmlElement
		    public void setPatient_address(String patient_address) {
		        this.patient_address = patient_address;
		    }
		    public String getReq_quantity() {
		        return req_quantity;
		    }
			@XmlElement
		    public void setReq_quantity(String req_quantity) {
		        this.req_quantity = req_quantity;
		    }
	}

