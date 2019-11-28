package com.ustglobal.java8feature;

import java.util.function.Supplier;

public class TestE {
 public static void main(String[] args) {
	Supplier<Student> s = ()->new Student(2, "abc", 67);
	Student s1 = s.get();
	System.out.println("Name is "+s1.name);
	System.out.println("Id is"+s1.id);
	System.out.println("percentage is"+s1.percentage);
	
	Supplier<Integer> i =()->20;
	int val = i.get();
	System.out.println("value is "+val);
	
	Supplier<String> sp = ()-> "Good Evening";
	String v = sp.get();
	System.out.println("String is "+v);
}
}
