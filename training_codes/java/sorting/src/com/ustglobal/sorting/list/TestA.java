package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class TestA {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		Student s = new Student(1, "Anu", 79);
		Student s1 = new Student(2, "jaggu", 60);
		Student s2 = new Student(3, "Pari", 55);
		Student s3 = new Student(4, "kittu",45.7);
		
		al.add(s);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		System.out.println("before sorting...");
		displayStudentDetails(al);
		Collections.sort(al);
		System.out.println("after sorting");
		displayStudentDetails(al);
		
	}
 static void displayStudentDetails(ArrayList<Student> al) {
	   Iterator<Student> itr = al.iterator();
	   while (itr.hasNext()) {
	Student student = itr.next();
		System.out.println("Id is "+student.id);
		System.out.println("Name is"+student.name);
		System.out.println("percentage is "+ student.percentage);
		System.out.println("-----------------------------------");
	}
   }


}
