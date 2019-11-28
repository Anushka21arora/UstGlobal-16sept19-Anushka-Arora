package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestA {
public static void main(String[] args) {
	HashSet hs = new HashSet<>();
	hs.add(12);
	hs.add(30);
	hs.add("anu");
	hs.add(56.7);
	hs.add(30);
	hs.add(null);
	System.out.println("----using for each----");
	for(Object o:hs) {
		System.out.println(o);
	}
	System.out.println("using iterator");
	Iterator itr = hs.iterator();
	while (itr.hasNext()) {
		Object object =  itr.next();
		System.out.println(object);
	}
}
}
