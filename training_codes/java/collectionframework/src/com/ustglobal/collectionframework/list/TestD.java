package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestD {
	public static void main(String[] args) {
      ArrayList al = new ArrayList();
      al.add(10);
      al.add(45.5);
      al.add("anu");
      al.add(true);
      ListIterator le = al.listIterator();
      System.out.println("Forward----------------->");
      while (le.hasNext()) {
    	  Object o = le.next();
    	  System.out.println(o);
		
		
	}
      System.out.println("<------------------previous");
      while (le.hasPrevious()) {
    	  Object o = le.previous();
    	  System.out.println(o);
		
		
	}
	}
}
