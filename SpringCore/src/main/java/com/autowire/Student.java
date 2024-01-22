package com.autowire;

public class Student {

	private Address address;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(Address addres) {
		super();
		this.address = addres;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
}
