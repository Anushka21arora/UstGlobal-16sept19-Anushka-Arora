package com.ustglobal.sorting.list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TestI {
public static void main(String[] args) {
TreeSet<Employee> hs = new TreeSet<Employee>();
	
	Employee e1 = new Employee(1, "anu", 25000);
	Employee e2 = new Employee(12, "vaibhav", 30000);
	Employee e3 = new Employee(34, "pari", 50000);
	Employee e4 = new Employee(56, "pradeep", 100000);
	Employee e5 = new Employee(56, "pradeep", 100000);
	
	hs.add(e1);
	hs.add(e2);
	hs.add(e3);
	hs.add(e4);
	hs.add(e5);
	System.out.println("using iterator");
	Iterator<Employee> itr = hs.iterator();
	while (itr.hasNext()) {
		Employee employee = itr.next();
		System.out.println(employee);
		System.out.println("------------------");
	}
	
}
}
