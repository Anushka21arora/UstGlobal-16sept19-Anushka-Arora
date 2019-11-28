package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestE {
public static void main(String[] args) {
	TreeSet ts = new TreeSet();
	ts.add(12);
	ts.add(34);
	ts.add(18);
	ts.add(89);
	//ts.add("anu"); tree set we can add only one type of data throw classCasteExcpetion
	//ts.add(null); no null is allowed it will throw nullPointerExcpetion
	System.out.println("for each");
	for(Object o: ts) {
		System.out.println(o);
	}
	System.out.println("Iterator");
	Iterator<Object> itr = ts.iterator();
	while (itr.hasNext()) {
		Object o =  itr.next();
		System.out.println(o);
	}
}
}
