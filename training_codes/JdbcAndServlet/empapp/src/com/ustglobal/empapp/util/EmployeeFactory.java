package com.ustglobal.empapp.util;

import com.ustglobal.empapp.dao.EmployeeDAO;
import com.ustglobal.empapp.dao.EmployeeDAOImpl;

//it is a factory class
public class EmployeeFactory {
	private EmployeeFactory() {}
	public static EmployeeDAO getEmployeeDAO() {
		return new EmployeeDAOImpl();//factory method returns object to interface
	}
	
}
