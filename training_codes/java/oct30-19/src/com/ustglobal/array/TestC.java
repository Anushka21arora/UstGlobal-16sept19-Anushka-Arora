package com.ustglobal.array;

public class TestC {
public static void main(String[] args) {
	Student s= new Student(1, "anu", 89);
	Student s1 = new Student(2, "radhya", 50);
	Student s2 = new Student(3, "ahanaa", 79);
	
	Student[] students = new Student[3];
	
	students[0] = s;
	students[1]= s1;
	students[2]= s2;
	for(Student stu :students) {
		System.out.println(stu);
		
	}
	
	
}
}
