package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestB {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("vijay");
		hs.add("ajay");
		hs.add("sanjay");
		hs.add("sujay");

		System.out.println("---using for each----");
		for(String s : hs) {
			System.out.println(s);
		}
		System.out.println("---using iterator----");
		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			String string =  itr.next();
			System.out.println(string);
		}

	}
}
