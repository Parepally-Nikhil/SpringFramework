package com.annotations;

import javax.annotation.PostConstruct;

import javax.annotation.PreDestroy;

public class Department {

	private String dname;

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Init Method");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy Method");
	}
}
