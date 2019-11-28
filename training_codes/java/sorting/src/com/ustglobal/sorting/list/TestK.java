package com.ustglobal.sorting.list;

import java.util.Iterator;
import java.util.TreeSet;

public class TestK {
public static void main(String[] args) {
	Customer c1 = new Customer("abc",1, 1200);
	Customer c2 = new Customer("efg", 2, 3455);
	Customer c3 = new Customer("qwe", 5, 12345);
	Customer c4 = new Customer("htrr", 12, 8766);
	SortCustomerByName scn= new SortCustomerByName();
	TreeSet<Customer> ts = new TreeSet<Customer>(scn);
	ts.add(c1);
	ts.add(c2);
	ts.add(c3);
	ts.add(c4);
	
	System.out.println("using iterator");
	Iterator<Customer> itr = ts.iterator();
	while (itr.hasNext()) {
		Customer c =  itr.next();
		System.out.println(c);
	}
	
}
}
