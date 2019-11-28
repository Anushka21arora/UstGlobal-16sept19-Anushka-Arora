package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.omg.Messaging.SyncScopeHelper;

public class TestG {
public static void main(String[] args) {
	Comparator<Employee> cmp = (e4,e5)->{
		return e4.name.compareToIgnoreCase(e5.name);
	};
	ArrayList<Employee> al = new ArrayList<>();
	Employee e1 = new Employee(1, "anu");
	Employee e2 = new Employee(2, "vaibhav");
	Employee e3 = new Employee(3,"pradeep");
	al.add(e1);
	al.add(e2);
	al.add(e3);
	
	List<Employee> l = al.stream().sorted(cmp).collect(Collectors.toList());
	Iterator<Employee> itr = l.iterator();
	while (itr.hasNext()) {
		Employee e =  itr.next();
		System.out.println(e.name);
		System.out.println(e.id);
		System.out.println("-------------");
	}
}
}
