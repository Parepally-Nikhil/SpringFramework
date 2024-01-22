package com.beanpostprocessor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class LifeCycleMainApp {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("LifeCycle.xml");
		HelloWorld hw=(HelloWorld)context.getBean("ls");
		context.registerShutdownHook();
		hw.getMessage();
	}

}