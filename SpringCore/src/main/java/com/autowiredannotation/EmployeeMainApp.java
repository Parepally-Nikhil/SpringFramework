package com.autowiredannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMainApp {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("EmployeeAutowired.xml");
		Employee employee=(Employee)context.getBean("emp");
		Address address=employee.getAddress();
		System.out.println(address.getCity());
		System.out.println(address.getCountry());
		
//		Employee e=new Employee();
//		Address add=e.getAddress();
//											//this will not be executed
//		System.out.println(add.getCity());
//		System.out.println(add.getCountry());
	}

}
