package com.ustglobal.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteQuery {
public static void main(String[] args) {
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	try {
		//step1 

		Class.forName("com.mysql.jdbc.Driver");
		
		//step2
		String url ="jdbc:mysql://localhost:3306/ust_hibernate?user=root&password=root";
	     conn= DriverManager.getConnection(url);
	     
	     //step3
	     String sql ="delete from student where id=?";
	     pstmt = conn.prepareStatement(sql);
	     

	     pstmt.setInt(1, Integer.parseInt(args[0]));
	     
	     int count = pstmt.executeUpdate();
	     //step4
	     System.out.println(count+ " Row(S) Deleted");
	     
	} catch (Exception e) {
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
