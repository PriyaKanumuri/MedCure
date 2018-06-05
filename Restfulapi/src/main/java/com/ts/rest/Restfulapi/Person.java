package com.ts.rest.Restfulapi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Person {
private String name;
private String password;
private String email;
private String phone;
private String address;
private String aadhar;
public Person() {
	super();
}
public Person(String name,String password,String email,String phone,String address, String aadhar) {
	super();
	
	this.name = name;
	this.password=password;
	this.email = email;
	this.phone=phone;
	this.address=address;
	this.aadhar=aadhar;
}
public String getEmail() {
	return email;
}
@XmlElement
public void setEmail(String email) {
	this.email = email;
}
public String getName() {
	return name;
}
@XmlElement
public void setName(String name) {
	this.name = name;
}

public String getPassword() {
	return password;
}
@XmlElement
public void setPassword(String password) {
	this.password = password;
}
public String getPhone() {
	return phone;
}
@XmlElement
public void setPhone(String phone) {
	this.phone = phone;
}
public String getAddress() {
	return address;
}
@XmlElement
public void setAddress(String address) {
	this.address = address;
}
public String getAadhar() {
	return aadhar;
}
@XmlElement
public void setAadhar(String aadhar) {
	this.aadhar = aadhar;
}
@Override
public String toString() {
	return "Student [name=" + name + ", password=" + password + ", email=" +email+ ",phone=" +phone+ ",address= "+address+",aadhar =" +aadhar+"]";
}
}