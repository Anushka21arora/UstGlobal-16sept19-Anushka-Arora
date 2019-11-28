package com.ustglobal.exception.first;

public class TestE {
public static void main(String[] args) {
	System.out.println("main Started");
	
	String s = "hello";
	int[] a = {10,20,30};
	int b =10;
	try {
		String s1 = s.toUpperCase();
		System.out.println(s1);
		System.out.println(a[2]);
		System.out.println(b/0);
	} catch (NullPointerException npe) {
		System.out.println("dont play with null");
	}catch(ArrayIndexOutOfBoundsException ae) {
		System.out.println("index not present");
	}catch(ArithmeticException ai) {
		System.out.println("number divided by zero");
	}
	
	System.out.println("main ended");
}
}
