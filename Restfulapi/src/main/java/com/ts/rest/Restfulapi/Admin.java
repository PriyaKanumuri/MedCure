package com.ts.rest.Restfulapi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Admin {
	private String name;
	private String password;

	public Admin() {
		super();
	}
public Admin(String name,String password) {
	super();
	
	this.name = name;
	this.password=password;
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

@Override
public String toString() {
	return "Student [name=" + name + ", password=" + password + "]";
}
}


