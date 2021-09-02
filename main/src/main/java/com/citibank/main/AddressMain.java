package com.citibank.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.citibank.model.Address;

public class AddressMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		
		Address address = applicationContext.getBean("address", Address.class);
		System.out.println("HashCode of address :: " + address.hashCode());
		
		System.out.println("-------------------------------------");
		
		Address address2 = applicationContext.getBean("address", Address.class);
		System.out.println("HashCode of address2 :: " + address2.hashCode());

		System.out.println(address);

	}

}
