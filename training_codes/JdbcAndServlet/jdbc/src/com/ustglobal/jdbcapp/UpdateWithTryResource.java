package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class UpdateWithTryResource {
public static void main(String[] args) {
	try(FileReader reader = new FileReader("db.properties")){
		Properties prop = new Properties();
		prop.load(reader);
		Class.forName(prop.getProperty("driver-class-name"));
		String url = prop.getProperty("url");
		String sql = prop.getProperty("update-query");
		try(Connection conn = DriverManager.getConnection(url,prop);
				Statement stmt = conn.createStatement()){
			int count = stmt.executeUpdate(sql);
			System.out.println(count+ " Row(S) Updated");
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
