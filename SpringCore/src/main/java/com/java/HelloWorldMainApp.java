package com.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldMainApp {

	public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(HelloWorldConfig.class);
	HelloWorld hw=context.getBean(HelloWorld.class);
	hw.setMsg("Java Config Program");
	System.out.println(hw.getMsg());
	}

}
