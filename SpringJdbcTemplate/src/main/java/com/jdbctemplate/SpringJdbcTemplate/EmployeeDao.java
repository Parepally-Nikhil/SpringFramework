package com.jdbctemplate.SpringJdbcTemplate;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
    public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int saveEmployee(Employee e){

    	String query="insert into emp values('"+e.getEmpid()+"','"+e.getEmpname()+"','"+e.getEmpdesign()+"')";
        return jdbcTemplate.update(query);
    }
    
    public int updateEmployee(Employee e){
        String query="update emp set empname='"+e.getEmpname()+"' where empid='"+e.getEmpid()+"' ";
        return jdbcTemplate.update(query);
    }
    
    public int deleteEmployee(Employee e){
        String query="delete from emp where empid='"+e.getEmpid()+"' ";
        return jdbcTemplate.update(query);
    }
    
    public List<Employee> getAllEmployeesRowMapper(){
        return jdbcTemplate.query("select * from emp",new RowMapper<Employee>(){
           public Employee mapRow(ResultSet rs, int rownumber) throws SQLException {
               Employee e=new Employee();
               e.setEmpid(rs.getString(1));
               e.setEmpname(rs.getString(2));
               e.setEmpdesign(rs.getString(3));
               return e;
           }
           });
       }
}