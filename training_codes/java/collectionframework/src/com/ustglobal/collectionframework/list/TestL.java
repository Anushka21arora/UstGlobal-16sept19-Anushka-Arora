package com.ustglobal.collectionframework.list;

import java.util.Collections;
import java.util.LinkedList;

public class TestL {
public static void main(String[] args) {
	LinkedList<Integer>l = new LinkedList<Integer>();
	l.add(12);
	l.add(23);
	l.add(34);
	l.add(3);
	l.add(10);
	System.out.println("Before sort"+l);
	Collections.sort(l);//generic type data and don't pass null
	System.out.println("After sort"+l);//return type is void affect the original list
	
	Collections.reverse(l);
	System.out.println("After reverse"+l);
	
	Collections.shuffle(l);//collections is having private constructor so we cannot instantitate it and it is having public static methods
	System.out.println("After shuffle"+l);
}

}
