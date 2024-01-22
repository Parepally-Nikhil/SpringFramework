package com.jdbctemplate.SpringJdbcTemplate;

public class Employee {
	private String empid;
	private String empname;
	private String empdesign;
	public Employee() {
		
	}
	public Employee(String empid, String empname, String empdesign) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empdesign = empdesign;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpdesign() {
		return empdesign;
	}
	public void setEmpdesign(String empdesign) {
		this.empdesign = empdesign;
	}
	
}