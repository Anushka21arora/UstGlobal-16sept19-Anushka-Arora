package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestB {
public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add(10);
	al.add(19.90);
	al.add(true);
	al.add("anu");
	for(Object o:al) {
		System.out.println(o);
	}
}
}
