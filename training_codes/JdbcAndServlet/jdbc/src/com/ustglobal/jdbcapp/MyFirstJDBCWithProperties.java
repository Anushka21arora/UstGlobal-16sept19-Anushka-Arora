package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class MyFirstJDBCWithProperties {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt =null;
		ResultSet rs = null;//only for select query
		FileReader reader = null;
		try {
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			

			//step 1: load the driver
			Class.forName(prop.getProperty("driver-class-name"));
			//or
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);

			//step 2:Get the connection
			String url = prop.getProperty("url");
			conn = DriverManager.getConnection(url, prop);
			                 
			                //or
//			String url ="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
//			conn = DriverManager.getConnection(url);
			
			                //or
			//String url ="jdbc:mysql://localhost:3306/ust_ty_db";
			//conn = DriverManager.getConnection(url, "root", "root");

			//step 3 Issue SQL Query
			stmt = conn.createStatement();
			String sql =prop.getProperty("select-query");
			//String sql="select * from employee_info";
			rs = stmt.executeQuery(sql);

			//step 4 Read the Result
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int sal = rs.getInt("sal");
				String gender = rs.getString("gender");
				System.out.println("ID: "+id);
				System.out.println("Name: "+name);
				System.out.println("Salary is: "+sal);
				System.out.println("Gender is : "+gender);
				System.out.println("----------------------");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			//step 5 close all JDBC object
			try {
				if(conn!=null) {
					conn.close();
				}
				if(stmt!=null) {
					stmt.close();
				}
				if(rs!=null) {
					rs.close();

				}
				if(reader!=null) {
					reader.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}

		}
	}
}
