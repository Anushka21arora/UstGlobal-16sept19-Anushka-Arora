package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestJ {
public static void main(String[] args) {
	ArrayList<Student> al = new ArrayList<Student>();
	Student s = new Student(1, "anu",89.9);
	Student s1 = new Student(2, "jaggu", 60);
	Student s2 = new Student(3, "vaibhav", 70);
	
	al.add(s);
	al.add(s1);
	al.add(s2);
	
	for(int i = 0 ;i<al.size();i++) {
		Student stu = al.get(i);
		//System.out.println(stu);
		System.out.println("ID is "+s.id);
		System.out.println("Name is "+s.name);
		System.out.println("Percentage is"+s.percentage);
		
	}
	System.out.println("----for each----");
	for(Student stud:al) {
		System.out.println(stud);
	}
}
}
