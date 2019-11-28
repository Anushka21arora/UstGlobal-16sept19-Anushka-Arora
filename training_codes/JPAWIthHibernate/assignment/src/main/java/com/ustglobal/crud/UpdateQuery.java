package com.ustglobal.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;


public class UpdateQuery {
public static void main(String[] args) {
	String url ="jdbc:mysql://localhost:3306/ust_hibernate?user=root&password=root";
	String sql ="update student set name=? where id =?";
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	try {
		
		//step1
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		
		//step2
		conn= DriverManager.getConnection(url);
		//step3
		pstmt=conn.prepareStatement(sql);
		
		
		
		String name = args[1];
		
		String sid = args[0];
		int id= Integer.parseInt(sid);
		
		
		pstmt.setInt(2, id);
		pstmt.setString(1, name);
		
		
		int count = pstmt.executeUpdate();
		
		//step4
		System.out.println(count+" Row(S) Updated");

		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	finally {
		try {
			if(conn!=null)
				conn.close();
			if(pstmt!=null)
				pstmt.close();
		} catch (SQLException e2) {
			e2.printStackTrace();
		}
	}
}
}
