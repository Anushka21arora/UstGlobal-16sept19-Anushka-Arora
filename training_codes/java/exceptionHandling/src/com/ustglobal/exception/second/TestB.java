package com.ustglobal.exception.second;

import java.io.IOException;
import java.sql.SQLException;

public class TestB {
	public static void main(String[] args) {
		System.out.println("main started");
		FileTest ft = new FileTest();
		try {
			try {
				try {
					ft.open();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (ClassNotFoundException e) {

				e.printStackTrace();
			}
		} catch (IOException e) {

			e.printStackTrace();
		}


		System.out.println("main ended");
	}
}
