package com.jdbc.SpringJdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

public class Operations {
	@Autowired
	private DBConnect dbc;

	public DBConnect getDbc() {
		return dbc;
	}

	public void setDbc(DBConnect dbc) {
		this.dbc = dbc;
	}
	public void displayData() {
		try {
		Connection con=dbc.getConnection();
		PreparedStatement pstmt=con.prepareStatement("select * from student");
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getString(1)+" "+rs.getString(2));
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void insertData() {
    	try
        {
    	Connection con=dbc.getConnection();
        PreparedStatement stmt=con.prepareStatement("insert into student values(?,?)");
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter id:");
        String sid=sc.next();
        System.out.println("Enter name:");
        String sname=sc.next();
        stmt.setString(1, sid);
        stmt.setString(2, sname);
        
        int rs=stmt.executeUpdate();
        if(rs>0) {
        	System.out.println("Inserted successfully");
        }
        }
        catch(Exception e)
        {
        System.out.println(e);
        }
    }
    public void updateData() {
    	try
        {
    	Connection con=dbc.getConnection();
        PreparedStatement stmt=con.prepareStatement("update student set Studentname=? where Studentid=?");
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your id:");
        String sid=sc.next();
        System.out.println("Enter name to be updated:");
        String sname=sc.next();
        stmt.setString(1, sname);
        stmt.setString(2, sid);
        
        int rs=stmt.executeUpdate();
        if(rs>0) {
        	System.out.println("Updated successfully");
        }
        }
        catch(Exception e)
        {
        System.out.println(e);
        }
    }
    public void deleteData() {
    	try
        {
    	Connection con=dbc.getConnection();
        PreparedStatement stmt=con.prepareStatement("delete from student where Studentid=?");
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your id:");
        String sid=sc.next();
       
        stmt.setString(1, sid);
        
        int rs=stmt.executeUpdate();
        if(rs>0) {
        	System.out.println("Deleted successfully");
        }
        }
        catch(Exception e)
        {
        System.out.println(e);
        }
    }
}
