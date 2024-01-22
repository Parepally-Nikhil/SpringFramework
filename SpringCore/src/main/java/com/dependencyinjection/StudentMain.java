package com.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("DiStudentBean.xml");
		Student student=(Student)context.getBean("stud");
		Address address=student.getAddress();
		System.out.println("name:"+student.getName());
		System.out.println("City:"+address.getCity());
		System.out.println("Pincode:"+address.getPincode());
	}

}
