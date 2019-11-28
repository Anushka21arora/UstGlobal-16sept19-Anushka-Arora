package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestF {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("anu");
		al.add("vaibhav");
		al.add("reshu");
		al.add("pari");
		String name = al.get(0);
		System.out.println(name.toUpperCase());
		System.out.println("-----using iterator");
		Iterator<String>itr = al.iterator();
		while (itr.hasNext()) {
			String s =  itr.next();
			System.out.println(s);
		}
		System.out.println("----using list iterator");
		ListIterator<String> li = al.listIterator();
		while (li.hasNext()) {
			String string =  li.next();
			System.out.println(string);

		}
		System.out.println("------using for each");
		for(String n:al) {
			System.out.println(n);
		}
	}
}
