package com.ustglobal.objectclass;

public class TestF {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "anu", 25000);
		Employee e2 = new Employee(2, "vaibhav", 300000);
		Employee e3 = new Employee(1, "anu", 25000);
		System.out.println(e1.equals(e2));
		System.out.println(e2.equals(e3));
		System.out.println(e1.equals(e3));
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
	}
}
