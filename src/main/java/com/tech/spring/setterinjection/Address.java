package com.tech.spring.setterinjection;

public class Address{
	private String city;
	private String state;
	
	public String toString() {
		return city+" "+state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
