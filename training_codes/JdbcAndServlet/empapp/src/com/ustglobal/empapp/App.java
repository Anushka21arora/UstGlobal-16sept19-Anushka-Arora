package com.ustglobal.empapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ustglobal.empapp.dao.EmployeeDAO;
import com.ustglobal.empapp.dto.EmployeeBean;
import com.ustglobal.empapp.util.EmployeeFactory;

public class App {
	public static void main(String[] args) {
		System.out.println("Press 1 to get all Employee data");
		System.out.println("Press 2 to insert Employee data");
		System.out.println("Press 3 to update Employee data");
		System.out.println("Press 4 to delete Employee data");
		System.out.println("Press 5 to search single Employee data");

		Scanner scn = new Scanner(System.in);
		int ch = scn.nextInt();

		switch (ch) {
		case 1:
			EmployeeDAO impl = EmployeeFactory.getEmployeeDAO();
			List<EmployeeBean> result = impl.getAllEmployeeData();
			for (EmployeeBean bean : result) {
				System.out.println("Id :" + bean.getId());
				System.out.println("Name :" + bean.getName());
				System.out.println("Gender :" + bean.getGender());
				System.out.println("Salray :" + bean.getSal());
			}

			break;

		case 2:
			EmployeeDAO impl2 = EmployeeFactory.getEmployeeDAO();
			int id1 = scn.nextInt();
			String name = scn.next();
			int sal = scn.nextInt();
			String gender = scn.next();
			EmployeeBean bean1 = new EmployeeBean();
			bean1.setId(id1);
			bean1.setName(name);
			bean1.setSal(sal);
			bean1.setGender(gender);

			int res = impl2.insertEmployeeData(bean1);
			System.out.println(res + " Row(S) Inserted");
			break;
		case 3:
			EmployeeDAO impl3 = EmployeeFactory.getEmployeeDAO();
			int id2 = scn.nextInt();
			String name2 = scn.next();
			int sal2 = scn.nextInt();
			String gender2 = scn.next();
			EmployeeBean bean2 = new EmployeeBean();
			bean2.setId(id2);
			bean2.setName(name2);
			bean2.setSal(sal2);
			bean2.setGender(gender2);

			int res2 = impl3.updateEmployeeData(bean2);
			System.out.println(res2 + " Row(S) Updated");
			break;
		case 4:
			EmployeeDAO impl4 = EmployeeFactory.getEmployeeDAO();
			int id3 = scn.nextInt();
			int res3 = impl4.deleteEmployeeData(id3);
			System.out.println(res3 + " Row(S) Deleted");
			break;
		case 5:
			EmployeeDAO impl5 = EmployeeFactory.getEmployeeDAO();
			int id = scn.nextInt();
			EmployeeBean bean = impl5.searchEmployeeData(id);
			if (bean != null) {
				System.out.println("Id :" + bean.getId());
				System.out.println("Name :" + bean.getName());
				System.out.println("Gender :" + bean.getGender());
				System.out.println("Salray :" + bean.getSal());
			} else {
				System.out.println("No data found");
			}
			break;
		}

	}
}
