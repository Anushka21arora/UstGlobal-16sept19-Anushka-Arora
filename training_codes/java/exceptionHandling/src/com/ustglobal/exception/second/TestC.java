package com.ustglobal.exception.second;

import java.util.Scanner;

public class TestC {
public static void main(String[] args) {
	//Scanner s1 = new Scanner(System.in);//resource leak and not closed
	try(Scanner sc = new Scanner(System.in);
			Scanner sc1 = new Scanner(System.in)){
		System.out.println("enter age");
		int a = sc.nextInt();
		System.out.println("age" + a);
		try {
			System.out.println(a/0);
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		}finally {
			System.out.println("finally executed");
		}
		
	}
}
}
