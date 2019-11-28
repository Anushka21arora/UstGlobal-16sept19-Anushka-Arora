package com.ustglobal.java8feature.practice;

import java.util.function.Predicate;

public class TestA {
public static void main(String[] args) {
	
	Predicate<Person> p1 = (a)->{
		if(a.age>18)
			return true;
		else
			return false;
	};
	Person p = new Person("anu", 22);
	System.out.println("Result is " +p1.test(p));
	
}
}
