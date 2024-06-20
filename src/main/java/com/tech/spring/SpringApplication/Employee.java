package com.tech.spring.SpringApplication;

public class Employee {
	private int employeeId;
	private String employeeName;
	private String employeeRole;
	private String city;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeRole() {
		return employeeRole;
	}
	public void setEmployeeRole(String employeeRole) {
		this.employeeRole = employeeRole;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public void employeeDetails() {
		System.out.println(employeeName+", with employee ID "+ employeeId+", works as a "+employeeRole+" in "+city+".");
	}
}
