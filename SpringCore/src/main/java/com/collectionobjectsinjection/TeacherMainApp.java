package com.collectionobjectsinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TeacherMainApp {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("teacher.xml");
		Teacher t=(Teacher) context.getBean("t");
		
		System.out.println("Teacher name and id:");
		System.out.println(t.getName()+"  "+t.getId());
		
		System.out.println("Teacher contacts:");
		System.out.println(t.getContacts());
		
		System.out.println("Teacher subjects:");
		System.out.println(t.getSubjects());
		
		System.out.println("Teacher address:");
		System.out.println(t.getAddress());
		
		System.out.println("Teacher timetable:");
		System.out.println(t.getTimetable());
	}

}
