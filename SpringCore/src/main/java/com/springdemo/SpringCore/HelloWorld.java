package com.springdemo.SpringCore;

public class HelloWorld {

	private String msg;
	
	public HelloWorld() {
		System.out.println("Hello World Constructor");
	}

	public void show() {
		System.out.println("Hello World Show Method");
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
