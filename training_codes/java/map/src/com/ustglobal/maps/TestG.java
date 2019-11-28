package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class TestG {
public static void main(String[] args) {
	Employee e1 = new Employee(1, "a", 123);
	Employee e2 = new Employee(2, "b", 3445);
	Employee e3 = new Employee(3, "c", 56767);
	Employee e4 = new Employee(4, "d", 4564);
	Employee e5 = new Employee(5, "e", 34534);
	Employee e6 = new Employee(6, "e", 4543);
	Employee e7 = new Employee(7, "f", 656);
	
	ArrayList<Employee> al = new ArrayList<>();
	al.add(e1);
	al.add(e2);
	al.add(e3);
	
	ArrayList<Employee> al1 = new ArrayList<>();
	al1.add(e4);
	al1.add(e5);
	al1.add(e6);
	
	HashMap<String, ArrayList<Employee>> hm = new HashMap<>();
	hm.put("first", al);
	hm.put("Second", al1);
	
	ArrayList<Employee> first = hm.get("first");
	Iterator<Employee> itr = first.iterator();
	while (itr.hasNext()) {
		Employee employee = itr.next();
		System.out.println("name is "+employee.name);
		System.out.println("id is"+employee.id);
		System.out.println("salary is"+employee.salary);
		
	}
}
}
