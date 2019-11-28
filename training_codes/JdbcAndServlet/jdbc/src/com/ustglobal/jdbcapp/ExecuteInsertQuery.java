package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class ExecuteInsertQuery {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		FileReader reader = null;

		try {
			//step 1 loads the driver
			
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driver-class-name"));
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);

			//step 2 get the connection
			String url = prop.getProperty("url");
			conn= DriverManager.getConnection(url, prop);
//			String url ="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
//			conn = DriverManager.getConnection(url);

			//step 3 Issue the sql query
			String sql = prop.getProperty("insert-query");
			//String sql =" insert into employee_info values(7,'Anushka',25000,'F') ";
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
				if(reader!=null)
					reader.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}//end of main
}//end of ExecuteInserQuery
