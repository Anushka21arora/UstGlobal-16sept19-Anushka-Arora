package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class ExecuteUpdateQuery {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
        FileReader reader = null;
		try {
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			//step1 
			Class.forName(prop.getProperty("driver-class-name"));
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);

			//step2 
			String url = prop.getProperty("url");
			conn = DriverManager.getConnection(url, prop);
			//String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			//conn =DriverManager.getConnection(url);

			//step3
			String sql =prop.getProperty("update-query");
			//String sql ="update employee_info set name='Reshu' where id=7";
			stmt = conn.createStatement();
			int count = stmt.executeUpdate(sql);

			//step4 
			System.out.println(count+ "Row(S) Updated");



		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			//step5
			try {
				if(conn!=null)
					conn.close();
				if(stmt!=null)
					stmt.close();
				if(reader!=null)
					reader.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
