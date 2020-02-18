package com.my.oop;

public class Employee extends Person {
	private String employeeId;
	private String employeeTitle;
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeTitle() {
		return employeeTitle;
	}
	public void setEmployeeTitle(String employeeTitle) {
		this.employeeTitle = employeeTitle;
	}
	
	public Employee() {
		super("Bangladesh");
		System.out.println("In employee default constructor");
	}
}
