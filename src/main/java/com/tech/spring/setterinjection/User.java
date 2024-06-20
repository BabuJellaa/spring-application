package com.tech.spring.setterinjection;

public class User {
	private String name;
	private String state;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public void getUserDetails() {
		System.out.println("Name of the USer : "+ name+" and state of the User : "+state);
	}
}
