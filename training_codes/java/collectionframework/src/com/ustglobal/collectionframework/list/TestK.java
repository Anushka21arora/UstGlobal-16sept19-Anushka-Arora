package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.List;

public class TestK {
public static void main(String[] args) {
	ArrayList<Double> al = new ArrayList<Double>();
	al.add(12.3);
	al.add(null);
	al.add(23.5);
	al.add(23.5);
	al.add(34.7);
	al.add(54.7);
	System.out.println(al);
	al.add(2,54.6);
	System.out.println("after adding at 2 nd index"+al);
	al.remove(0);
	System.out.println("after removing 2 nd index "+al);
	al.remove(null);
	System.out.println("after removing null"+al);
	Double val =al.get(4);
	System.out.println("oject at 4 th index"+val);
	al.set(2, 77.6);
	System.out.println("after replacing 2nd index"+al);
	al.clear();
	System.out.println("after clear method"+al);
   List<Double> al1=new ArrayList<>();
   al1.add(20.5);
   al1.add(45.8);
   al1.add(22.7);
   
   al.addAll(al1);
   System.out.println("after add all"+al);
   
   boolean contain = al.containsAll(al1);
   System.out.println("conains all of al1"+contain);
   
   boolean res = al.removeAll(al1);
   System.out.println("removed all of al1"+res);
}
}
