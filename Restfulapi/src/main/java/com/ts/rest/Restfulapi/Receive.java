package com.ts.rest.Restfulapi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Receive {
		private String donor_name;
		private String patient_name;
		private String med_name;
		private String med_type;
		private String quantity;
		public Receive() {
			super();
		}
		public Receive(String donor_name,String patient_name,String med_name,String med_type,String quantity){
				super();
				this.donor_name = donor_name;
				this.patient_name = patient_name;
				this.med_name = med_name;
				this.med_type = med_type;
				this.quantity = quantity;
			}
		public String getDonor_name() {
				return donor_name;
			}
		@XmlElement
		public void setDonor_name(String donor_name) {
				this.donor_name = donor_name;
			}
		public String getPatient_name() {
				return patient_name;
			}
		@XmlElement
		public void setPatient_name(String patient_name) {
				this.patient_name = patient_name;
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
		public String getQuantity() {
				return quantity;
			}
		@XmlElement
		public void setQuantity(String quantity) {
				this.quantity = quantity;
			}
	

}
