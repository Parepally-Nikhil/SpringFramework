package com.beanfactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource res=new ClassPathResource("student.xml");
		BeanFactory bf=new XmlBeanFactory(res);
		Student s=(Student)bf.getBean("stud");
		System.out.println(s.getName());
	}
		
}
