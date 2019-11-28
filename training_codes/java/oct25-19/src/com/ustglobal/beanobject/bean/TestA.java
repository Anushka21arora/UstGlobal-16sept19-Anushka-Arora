package com.ustglobal.beanobject.bean;

public class TestA {
	public static void main(String[] args) {
       Student s = new Student();
       s.setId(1);
       s.setName("Anushka");
       s.setRollno(11);
       Database db = new Database();
       db.receive(s);
      
       Employee e1 = new Employee();
       e1.setId(1);
       e1.setName("Vaibhav");
       e1.setSalary(2500.50);
       e1.setDept(10);
       e1.setDesignation("Developer");
      
       db.save(e1);
}
}
