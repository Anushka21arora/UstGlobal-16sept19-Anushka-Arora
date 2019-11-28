package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class InsertWithTryReasource {
	public static void main(String[] args) {
		try(FileReader reader = new FileReader("db.properties")){
			Properties prop = new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driver-class-name"));
			String url = prop.getProperty("url");
			String sql =prop.getProperty("insert-query");
			try(Connection conn =DriverManager.getConnection(url,prop);
					PreparedStatement pstmt = conn.prepareStatement(sql)){
				int count = pstmt.executeUpdate();
				System.out.println(count+"Row(S) Inserted");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
