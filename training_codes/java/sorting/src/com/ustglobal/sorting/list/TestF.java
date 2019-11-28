package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class TestF {
	public static void main(String[] args) {
		ArrayList<Marker> al = new ArrayList<Marker>();
		  al.add(new Marker(10, "blue"));
		  al.add(new Marker(40, "green"));
		  al.add(new Marker(50, "pink"));
		  al.add(new Marker(20, "black"));
		  al.add(new Marker(39, "red"));
		  
		  System.out.println("before sorting-->");
		  display(al);
		 // ByPrice bp = new ByPrice();
		  ByColor color = new ByColor();
		 // Collections.sort(al, bp);
		  Collections.sort(al, color);
		  System.out.println("after soritng-->");
		  display(al);
		  
	}
  static void display(ArrayList<Marker> al) {
	  Iterator<Marker> itr = al.iterator();
	  while (itr.hasNext()) {
		Marker marker =  itr.next();
		System.out.println(marker);
	}
  }
}
