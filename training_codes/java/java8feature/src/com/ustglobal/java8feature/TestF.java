package com.ustglobal.java8feature;

import java.util.function.Consumer;

public class TestF {
	public static void main(String[] args) {
    Consumer<Student> c = s ->{
    System.out.println("name is"+s.name);
    System.out.println("id is "+s.id);
    System.out.println("percentage is" +s.percentage);
    
	};
  Student s1 = new Student(5, "addsf",45);
	c.accept(s1);
	}
}
