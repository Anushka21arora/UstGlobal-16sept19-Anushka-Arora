package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestC {
public static void main(String[] args) {
	LinkedHashSet lhs = new LinkedHashSet();
	lhs.add(23);
	lhs.add("anu");
	lhs.add(45.6);
	lhs.add(10);
	lhs.add(null);
	
	System.out.println("---using for each----");
	for(Object o :lhs) {
		System.out.println(o);
	}
	System.out.println("--using iterator--");
	Iterator itr = lhs.iterator();
	while (itr.hasNext()) {
		Object object = itr.next();
		System.out.println(object);
		
	}
}
}
