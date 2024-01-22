package com.autowiredannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMainApp {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("autowiredannotation.xml");
		Student student=(Student)context.getBean("stud");
		System.out.println(student.getName());
		System.out.println(student.getAge());
	}

}
