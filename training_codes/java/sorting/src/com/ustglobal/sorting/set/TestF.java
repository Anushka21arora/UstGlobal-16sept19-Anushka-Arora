package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestF {
public static void main(String[] args) {
	TreeSet<String> ts = new TreeSet<>();
	
	ts.add("dmg");
	ts.add("mjht");
	ts.add("abc");
	ts.add("xyz");
	
	System.out.println("for each");
	for(String s: ts) {
		System.out.println(s);
	}
	System.out.println("Iterator");
	Iterator<String> itr = ts.iterator();
	while (itr.hasNext()) {
		String s =  itr.next();
		System.out.println(s);
	}
}
}
