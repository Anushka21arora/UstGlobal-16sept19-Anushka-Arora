package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC {
public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add(20);
	al.add(22.78);
	al.add(true);
	al.add("reshu");
	System.out.println("-------------Iterator--------------");
	Iterator it = al.iterator();
	while(it.hasNext()) {
		Object o =it.next();
		System.out.println(o);
	}
	
	System.out.println("-------forloop for itertating-------");
	Iterator it1 = al.iterator();
	for(;it1.hasNext();) {
		Object ob= it1.next();
		System.out.println(ob);
	}
	System.out.println("------------for loop--------------");
	for(int i=0;i<al.size();i++) {
		Object o = al.get(i);
		System.out.println(o);
	}
	
}
}
