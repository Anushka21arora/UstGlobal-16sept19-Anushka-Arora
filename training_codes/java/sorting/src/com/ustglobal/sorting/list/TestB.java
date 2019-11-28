package com.ustglobal.sorting.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestB {
public static void main(String[] args) {
	LinkedList<Laptop> ll = new LinkedList<Laptop>();
	Laptop lp1= new Laptop(25000, 4, "hp");
	Laptop lp2 = new Laptop(35600, 6, "Dell");
	Laptop lp3 = new Laptop(50000, 8, "Asus");
	Laptop lp4 = new Laptop(100000, 12, "mac");
	
	ll.add(lp1);
	ll.add(lp2);
	ll.add(lp3);
	ll.add(lp4);
	ll.add(new Laptop(20000, 4, "acer"));
	System.out.println("-----before sorting------");
	displayLaptopDetails(ll);
	Collections.sort(ll);
	System.out.println("-----after sorting------");
	displayLaptopDetails(ll);
}
static void displayLaptopDetails(LinkedList<Laptop> l) {
	Iterator<Laptop> itr =l.iterator();
	while (itr.hasNext()) {
		Laptop laptop =  itr.next();
		System.out.println("Brand is"+laptop.name);
		System.out.println("ram is"+laptop.ram);
		System.out.println("price is"+laptop.price);
		System.out.println("----------------------");
		
	}
}
}
