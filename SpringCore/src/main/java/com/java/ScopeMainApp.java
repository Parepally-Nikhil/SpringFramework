package com.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScopeMainApp {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(ScopeDemoConfig.class);
		ScopeDemo sd1=context.getBean(ScopeDemo.class);
		sd1.setDemoMsg("Singleton");
		System.out.println(sd1.getDemoMsg());
		
		ScopeDemo sd2=context.getBean(ScopeDemo.class);
		//sd2.setDemoMsg("Singleton");
		System.out.println(sd2.getDemoMsg());

	}

}
