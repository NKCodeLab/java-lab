package com.citibank.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.citibank.model.Employee;

public class EmployeeMain {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring.xml");
		
		Employee employee = appContext.getBean("employee", Employee.class);
		//Employee employee2 = appContext.getBean("employee", Employee.class);
		//Employee employee3 = appContext.getBean("employee", Employee.class);
		
		System.out.println(employee);
		//System.out.println(employee2);
		//System.out.println(employee3);
	}

}
