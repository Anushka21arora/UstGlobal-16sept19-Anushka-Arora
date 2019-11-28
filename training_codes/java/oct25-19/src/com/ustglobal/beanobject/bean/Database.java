package com.ustglobal.beanobject.bean;

public class Database {
	void receive(Student s) {
      System.out.println("ID is "+s.getId());
      System.out.println("Name is "+s.getName());
      System.out.println("Rollno is "+s.getRollno());
      System.out.println("-------------------------");
      
	}
	void save(Employee e) {
		 System.out.println("ID is "+e.getId());
	      System.out.println("Name is "+e.getName());
	      System.out.println("Salary is "+e.getSalary());
	      System.out.println("Department is "+e.getDept());
	      System.out.println("designation is "+e.getDesignation());
	      System.out.println("-------------------------");
	}
}
