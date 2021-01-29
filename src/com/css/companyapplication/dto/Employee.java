package com.css.companyapplication.dto;

public class Employee {
	private int employeeID;
	private String name;
	private int age;
	
	

	public Employee(int employeeID, String name, int age) {
		super();
		this.employeeID = employeeID;
		this.name = name;
		this.age = age;
	}

	

	public int getEmployeeID() {
		return employeeID;
	}



	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}

	

	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", name=" + name + ", age=" + age + "]";
	}

	

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
