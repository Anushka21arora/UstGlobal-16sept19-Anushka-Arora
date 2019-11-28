package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestG {
public static void main(String[] args) {
	LinkedList li = new LinkedList();
	li.add(12);
	li.add(34.5);
	li.add("anu");
	
	System.out.println("----using for loop---");
	for (int i = 0; i <li.size(); i++) {
	Object o = li.get(i);
	System.out.println(o);
	}
	System.out.println("-----using for each");
	for(Object o :li) {
		System.out.println(o);
	}
	System.out.println("---using iterator--");
	Iterator itr = li.iterator();
	while (itr.hasNext()) {
		Object obj = itr.next();
		System.out.println(obj);
	}
	System.out.println("--using list iterator--");
	System.out.println("---forward----");
	ListIterator lis = li.listIterator();
	while (lis.hasNext()) {
		Object ob =  lis.next();
		System.out.println(ob);
	}
	System.out.println("-----backward--");
	while (lis.hasPrevious()) {
		Object ob =  lis.previous();
		System.out.println(ob);
	}
	
}

}
