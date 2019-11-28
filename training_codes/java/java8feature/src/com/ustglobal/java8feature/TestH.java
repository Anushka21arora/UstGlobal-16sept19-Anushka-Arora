package com.ustglobal.java8feature;

import java.util.ArrayList;

public class TestH {
public static void main(String[] args) {
	ArrayList<Student> al = new ArrayList<>();
	al.add(new Student(1, "anu", 89));
	al.add(new  Student(2, "vaibhav", 67));
	al.add(new Student(3, "bunny", 40.2));
	al.add(new Student(4, "panda", 50));
	al.add(new Student(5, "teddy", 32.5));
	Helper h = new Helper();
	//h.displayAllStudent(al);
	//h.displayFailedStudent(al);
	//h.displayPassedStudent(al);
	//h.displayTopperStudent(al);
	h.displayBackStudent(al);
	
}

}
