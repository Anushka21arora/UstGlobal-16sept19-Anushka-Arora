package com.ustglobal.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestI {
public static void main(String[] args) {
	Comparator<Employee> comp =(e1,e2)->{
		Integer i = e1.id;
		Integer j = e2.id;
		return i.compareTo(j);
	};
	TreeSet<Employee> ts = new TreeSet<Employee>(comp);
	Employee e1 = new Employee("anu", 12, 4.11);
	Employee e2 = new Employee("vaibhav", 4, 5.5);
	Employee e3 = new Employee("nikki", 23, 5.2);
	Employee e4 = new Employee("jaggu", 6, 5.1);
	
	ts.add(e1);
	ts.add(e2);
	ts.add(e3);
	ts.add(e4);
	
	System.out.println("using iterator");
	Iterator<Employee> itr = ts.iterator();
	while (itr.hasNext()) {
		Employee e =  itr.next();
		System.out.println("name is"+e.name);
		System.out.println("id is "+e.id);
		System.out.println("height is "+e.height);
		System.out.println("---------------------");
		
	}
}
}
