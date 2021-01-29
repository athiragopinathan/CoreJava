package com.css.companyapplication.dto;

import java.util.Arrays;
import java.util.HashMap;

public class Company {
	private int companyId;
	private Address empaddress;
	private Employee[] employee=new Employee[100];
	private HashMap<Integer,Employee> employeeMap;
	
	
	public Company(int companyId, Address empaddress, Employee[] employee, HashMap<Integer, Employee> employeeMap) {
		super();
		this.companyId = companyId;
		this.empaddress = empaddress;
		this.employee = employee;
		this.employeeMap = employeeMap;
	}
	

	public int getCompanyId() {
		return companyId;
	}


	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}


	public Address getEmpaddress() {
		return empaddress;
	}


	public void setEmpaddress(Address empaddress) {
		this.empaddress = empaddress;
	}


	public Employee[] getEmployee() {
		return employee;
	}


	public void setEmployee(Employee[] employee) {
		this.employee = employee;
	}


	public HashMap<Integer, Employee> getEmployeeMap() {
		return employeeMap;
	}


	public void setEmployeeMap(HashMap<Integer, Employee> employeeMap) {
		this.employeeMap = employeeMap;
	}


	public Company() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", empaddress=" + empaddress + ", employee="
				+ Arrays.toString(employee) + ", employeeMap=" + employeeMap + "]";
	}
	

}
