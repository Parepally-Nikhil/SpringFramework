package com.applicationcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Beans1.xml");
		Student s=(Student)ctx.getBean("stud");
		Address add=s.getAddr();
		System.out.println(s.getName());
		System.out.println(add.getCity());
		System.out.println(add.getCountry());
	}
}
