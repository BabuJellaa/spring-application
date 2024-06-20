package com.tech.spring.setterinjection;

public class EmployeesInfo {
	private String name;
	private int id;
	private Address address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void getDetailsByDependentObject() {
		System.out.println(name+id+address);
	}
	
	public void getEmployeeDetails() {
		System.out.println("Babu Jella, with employee ID 1839, works as a Software Developer in Hyderabad.");
	}
}
