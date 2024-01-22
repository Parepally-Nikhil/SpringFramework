package com.jdbctemplate.SpringJdbcTemplate;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String args[]) {
		ApplicationContext context=new ClassPathXmlApplicationContext("JdbcTemplate.xml");
		EmployeeDao dao=(EmployeeDao)context.getBean("edao");
		int status=dao.saveEmployee(new Employee("104","Mani","Electrical"));//for insert operation
		
		//int status=dao.updateEmployee(new Employee("103","Ankur","Software")); //for update operation        
		
//		Employee emp=new Employee(); 
//		emp.setEmpid("104");
//		int status=dao.deleteEmployee(emp); //for delete operation
//        System.out.println(status);
        
		List<Employee> list = dao.getAllEmployeesRowMapper();
		 
        for (Employee e : list)
            System.out.println(e.getEmpid() + "\t" + e.getEmpname() + "\t" + e.getEmpdesign());//for display operation
	}
}