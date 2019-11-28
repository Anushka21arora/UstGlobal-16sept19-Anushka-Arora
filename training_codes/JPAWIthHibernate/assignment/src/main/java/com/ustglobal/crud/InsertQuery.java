package com.ustglobal.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertQuery {
public static void main(String[] args) {
	Connection conn = null;
	Statement stmt = null;
	

	try {
		//step 1 loads the driver
		
		
		Class.forName("com.mysql.jdbc.Driver");

		//step 2 get the connection
		String url ="jdbc:mysql://localhost:3306/ust_hibernate?user=root&password=root";
		conn= DriverManager.getConnection(url);

		//step 3 Issue the sql query
		
		String sql =" insert into student values(2,'jaggu','jaggu@gmail.com') ";
		stmt = conn.createStatement();
		int count = stmt.executeUpdate(sql);

		// step 4 read the result
		System.out.println(count+ " Row(s) Inserted");




	} catch (Exception e) {
		e.printStackTrace();
	}
	finally {
		//step 5 close all objects
		try {
			if(conn != null)
				conn.close();
			if(stmt!= null)
				stmt.close();
			

		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
}
}
