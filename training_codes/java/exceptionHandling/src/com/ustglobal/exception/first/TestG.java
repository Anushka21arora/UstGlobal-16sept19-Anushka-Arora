package com.ustglobal.exception.first;

public class TestG {
public static void main(String[] args) {
	System.out.println("main Started");
	PayTm pay = new PayTm();
	try {
		pay.book();
	}catch(ArithmeticException ae) {
		System.out.println("Excpetion caught in main");
	}finally {
		System.out.println("finally block executed");
	}
	
	
	System.out.println("main ended");
}
}
