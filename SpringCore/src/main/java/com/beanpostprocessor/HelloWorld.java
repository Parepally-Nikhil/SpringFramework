package com.beanpostprocessor;

public class HelloWorld {
	private String message;
	
	 
    public HelloWorld() {
	
		System.out.println("Hello World");
	}

	public void setMessage(String message) {
        this.message = message;
    }
 
    public void getMessage() {
        System.out.println("Your Message : " + message);
    }
 
    public void init() {
        System.out.println("Bean is going through init.");
    }
 
    public void destroy() {
        System.out.println("Bean will destroy now.");
    }
}