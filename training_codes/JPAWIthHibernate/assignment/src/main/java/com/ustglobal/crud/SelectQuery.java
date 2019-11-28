package com.ustglobal.crud;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class SelectQuery {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
	  String url ="jdbc:mysql://localhost:3306/ust_hibernate?user=root&password=root";
		String sql="select * from student";
	  
	  try {
		  Class.forName("com.mysql.jdbc.Driver");
		  conn= DriverManager.getConnection(url);
		  stmt=conn.createStatement();
		  rs= stmt.executeQuery(sql);
		 
		  while(rs.next()) {
			  System.out.println("ID: "+rs.getInt("id"));
				System.out.println("Name: "+rs.getString("name"));
				System.out.println("email is: "+rs.getString("email"));
			    System.out.println("----------------------");
		  }
		
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		try {
			if(conn!=null)
				conn.close();
			if(stmt!= null)
				stmt.close();
			if(rs!=null)
				rs.close();
			
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
	}
	
}
	