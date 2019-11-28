package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestA {
public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add(21);
	al.add(22.5);
	al.add("Anu");
	al.add(null);
	al.add(true);
	Object o =al.get(2);
	System.out.println(o);
	for(int i=0;i<5;i++) {
		Object obj = al.get(i);
		System.out.println(obj);
	}
	
}
}
