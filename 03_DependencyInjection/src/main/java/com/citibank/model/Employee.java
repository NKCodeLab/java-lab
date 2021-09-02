package com.citibank.model;

import com.citibank.model.Address;

public class Employee {

	private int employeeId;
	private String name;
	private double salary;
	private Address residentialAddress;
	
	public Employee() {
	 System.out.println("Default constructor for Employee");	 
	}

	public Employee(int employeeId, String name, double salary, Address residentialAddress) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		this.residentialAddress = residentialAddress;
		
		System.out.println("Overloaded constructor of Employee");
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Address getResidentialAddress() {
		System.out.println("getResidentialAddress() called");
		return residentialAddress;
	}

	public void setResidentialAddress(Address residentialAddress) {
		System.out.println("setResidentialAddress(..) called");
		this.residentialAddress = residentialAddress;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + ", residentialAddress="
				+ residentialAddress + "]";
	}
	
	
	
	
	
}
