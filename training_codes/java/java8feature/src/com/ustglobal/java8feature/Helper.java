package com.ustglobal.java8feature;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Helper {
void displayAllStudent(ArrayList<Student> al) {
	Iterator<Student> itr = al.iterator();
	while (itr.hasNext()) {
		Student s =  itr.next();
		System.out.println("name is "+s.name);
		System.out.println("id is "+s.id);
		System.out.println("percentage is"+s.percentage);
		
		
	}
	
}
void displayFailedStudent(ArrayList<Student> al) {
	 List<Student> l= al.stream().filter(student->student.percentage< 40).collect(Collectors.toList());
	 Iterator<Student> itr = l.iterator();
		while (itr.hasNext()) {
			Student s =  itr.next();
			System.out.println("name is "+s.name);
			System.out.println("id is "+s.id);
			System.out.println("percentage is"+s.percentage);
			
			
		}
}
void displayPassedStudent(ArrayList<Student> al) {
	 List<Student> l= al.stream().filter(student->student.percentage> 40).collect(Collectors.toList());
	 Iterator<Student> itr = l.iterator();
		while (itr.hasNext()) {
			Student s =  itr.next();
			System.out.println("name is "+s.name);
			System.out.println("id is "+s.id);
			System.out.println("percentage is"+s.percentage);
			
			
		}
		
}
void displayTopperStudent(ArrayList<Student> al) {
	Comparator<Student> cmp = (s1,s2) ->{
	Double i = s1.percentage;
	Double j = s2.percentage;
  return i.compareTo(j);
	};
 Student l= al.stream().max(cmp).get();
 System.out.println("name is "+l.name);
	System.out.println("id is "+l.id);
	System.out.println("percentage is"+l.percentage);
}
void displayBackStudent(ArrayList<Student> al) {
	Comparator<Student> cmp = (s1,s2) ->{
	Double i = s1.percentage;
	Double j = s2.percentage;
  return i.compareTo(j);
	};
 Student l= al.stream().min(cmp).get();
 System.out.println("name is "+l.name);
	System.out.println("id is "+l.id);
	System.out.println("percentage is"+l.percentage);
}
}
