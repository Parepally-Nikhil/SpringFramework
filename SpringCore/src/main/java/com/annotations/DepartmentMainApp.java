package com.annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DepartmentMainApp {
	
	public static void main(String args[]) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
                "init.xml");
        Department department  = (Department) context.getBean("dept");
        System.out.println(department.getDname());
        context.registerShutdownHook();
	}
}
