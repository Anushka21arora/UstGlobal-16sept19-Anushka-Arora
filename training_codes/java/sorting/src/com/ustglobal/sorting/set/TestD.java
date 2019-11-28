package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD {
public static void main(String[] args) {
	LinkedHashSet<Double> lhs = new LinkedHashSet<Double>();
	lhs.add(45.8);
	lhs.add(12.9);
	lhs.add(23.5);
	lhs.add(56.7);
	
	System.out.println("for each");
	for(Double d: lhs) {
		System.out.println(d);
	}
	System.out.println("Iterator");
	Iterator<Double> itr = lhs.iterator();
	while (itr.hasNext()) {
		Double double1 =  itr.next();
		System.out.println(double1);
	}
}
}
