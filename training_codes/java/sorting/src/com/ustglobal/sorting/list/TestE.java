package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestE {
public static void main(String[] args) {
	Pen p = new Pen(10, "cello","black");
	Pen p1 = new Pen(20, "flair","red");
	Pen p2 = new Pen(50, "Ranolds","blue");
	Pen p3 = new Pen(500, "parker","blue");
	ArrayList<Pen> al = new ArrayList<Pen>();
	al.add(p);
	al.add(p1);
	al.add(p2);
	al.add(p3);
	System.out.println("before----");
	display(al);
	System.out.println("after---");
	Collections.sort(al);
	display(al);
}
static void display(ArrayList<Pen> al) {
	Iterator<Pen> itr = al.iterator();
	while (itr.hasNext()) {
		Pen pen =  itr.next();
		System.out.println(pen);
		
	}
	
}
}
