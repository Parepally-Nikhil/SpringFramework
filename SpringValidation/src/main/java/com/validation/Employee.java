package com.validation;

import java.sql.Date;



import javax.validation.constraints.Max;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class Employee {
	@NotBlank(message="this should not be blank")
	private String name;
	@Size(min=8,message="Password must be 8 characters long")
	@Password
	private String pass;
	@Min(value=20000) @Max(value=40000)
	private int salary;
	@Datev
	
	//@DateTimeFormat(pattern="dd-mm-yyyy")
	private Date date;
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}