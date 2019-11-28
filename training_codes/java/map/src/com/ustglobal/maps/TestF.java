package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestF {
public static void main(String[] args) {
	Student s1 = new Student(1, "anu",79.6 );
	Student s2 = new Student(5, "virat", 80.8);
	Student s3 = new Student(8, "sid", 81.1);
	Student s4 = new Student(18, "x", 85.5);
	Student s5 = new Student(28, "y", 45.6);
	Student s6 = new Student(38, "z", 67.7);
	Student s7 = new Student(48, "l", 89.8);
	Student s8 = new Student(58, "m", 39.2);
	Student s9 = new Student(68, "n", 90.8);
	
	
	ArrayList<Student> al = new ArrayList<>();
	al.add(s1);
	al.add(s2);
	al.add(s3);
	
	ArrayList<Student> al1 = new ArrayList<>();
	al1.add(s4);
	al1.add(s5);
	al1.add(s6);
	
	ArrayList<Student> al2 = new ArrayList<>();
	al2.add(s7);
	al2.add(s8);
	al2.add(s9);
	
	
	HashMap<String, ArrayList<Student>> hm = new HashMap<>();
	hm.put("first", al);
	hm.put("Second", al1);
	hm.put("Third", al2);
	
	
	ArrayList<Student> first = hm.get("Second");
	Iterator<Student> itr = first.iterator();
	while (itr.hasNext()) {
		Student student =  itr.next();
		System.out.println("name is "+student.name);
		System.out.println("id is"+student.id);
		System.out.println("percentage is"+student.percentage);
	}
}
}
