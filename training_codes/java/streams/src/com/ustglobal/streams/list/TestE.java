package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class TestE {
public static void main(String[] args) {
	ArrayList<Integer> marks = new ArrayList<Integer>();
	marks.add(70);
	marks.add(25);
	marks.add(56);
	marks.add(14);
	marks.add(20);
	   Comparator<Integer> cmp =(m1,m2)->{
		   if(m1>m2) {
			   return 1;
		   }else if(m1<m2) {
			   return -1;
		   }else
			   return 0;
	   };
	 long noOfFailedStudents = marks.stream().filter(i-> i< 40).count();//return type of count is long
	 System.out.println(noOfFailedStudents);
	 System.out.println("--------------------------");
	Integer i = marks.stream().min(cmp).get();
	System.out.println("min value "+i);
	System.out.println("---------------------");
	Integer i1 = marks.stream().max(cmp).get();
	System.out.println("max value is "+i1);
	
	 
	
}
}
