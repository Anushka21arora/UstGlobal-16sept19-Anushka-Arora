package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class ExecuteDeleteQuery {
public static void main(String[] args) {
	Connection conn = null;
	Statement stmt = null;
	FileReader reader = null;
	try {
		//step 1
		reader = new FileReader("db.properties");
		Properties prop = new Properties();
		prop.load(reader);
		Class.forName(prop.getProperty("url"));
		
//		Driver driver = new Driver();
//		DriverManager.registerDriver(driver);
		
		//step 2
		String url = prop.getProperty("url");
		conn = DriverManager.getConnection(url, prop);
//		String url ="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
//		conn=DriverManager.getConnection(url);
		
		//step 3
		String sql = prop.getProperty("delete-query");
		//String sql ="Delete from employee_info where id = 6";
		stmt = conn.createStatement();
		int count = stmt.executeUpdate(sql);
		
		//step 4
		System.out.println(count +" Row(S) Deleted");
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally {
		//step 5 
		try {
			if(conn!= null)
				conn.close();
			if(stmt!= null)
				stmt.close();
			
		} catch (SQLException e2) {
		    e2.printStackTrace();
		}
	}
}
}
