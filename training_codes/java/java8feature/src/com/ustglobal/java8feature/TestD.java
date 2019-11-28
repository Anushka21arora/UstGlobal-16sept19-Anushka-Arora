package com.ustglobal.java8feature;

import java.util.function.Function;

public class TestD {
public static void main(String[] args) {
	Function<Integer, Student> f =id->{
		Student s = new Student(2, "anu", 56.8);
		s.id= id;
		return s;
	};
	Student s = f.apply(27);

	System.out.println("Name is "+s.name);
    System.out.println("Id is "+s.id);
     System.out.println("Percentage is "+s.percentage);
}
}
