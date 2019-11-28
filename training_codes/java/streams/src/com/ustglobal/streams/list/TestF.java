package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestF {
public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<Integer>();
	al.add(23);
	al.add(45);
	al.add(10);
	al.add(78);
	List<Integer> l =al.stream().sorted().collect(Collectors.toList());
   Iterator<Integer> itr = l.iterator();
   while (itr.hasNext()) {
	Integer i =  itr.next();
	
	System.out.println(i);
	
}
}
}
