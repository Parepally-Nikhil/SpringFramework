package com.jdbc.SpringJdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.annotation.Autowired;

public class DBConnect {
	@Autowired
	private DBConnectDetails dbcd;

	

	public DBConnectDetails getDbcd() {
		return dbcd;
	}

	public void setDbcd(DBConnectDetails dbcd) {
		this.dbcd = dbcd;
	}
	
	public Connection getConnection() {
		Connection con=null;
		try {
			Class.forName(dbcd.getDriverName());
			con=DriverManager.getConnection(dbcd.getUrl(),dbcd.getUserName(),dbcd.getPwd());
			
		}
		catch(Exception e) {
			
		}
		return con;
	}
}