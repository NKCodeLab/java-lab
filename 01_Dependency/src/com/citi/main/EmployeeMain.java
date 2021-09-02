package com.citi.main;

import com.citi.model.Address;
import com.citi.model.Employee;

public class EmployeeMain {

	public static void main(String[] args) {

		System.out.println("Employee Main");
		
		Address address = new Address("A404", "Nisarg CHG",
				"A B Road ", "Pune", "Maharashtra", 123456, "India");
		Employee emp = new Employee(101, "Nileh", 2000, address);
		System.out.println(emp.toString());

	}

}
