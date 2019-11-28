package com.ustglobal.scanner;

import java.util.Scanner;
public class Test {
        public static void main(String[] args) {
			System.out.println("Scanner class");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter age");
			int age = sc.nextInt();
			System.out.println("Age is "+age);
			System.out.println("Enter a Sentence");
			String s= sc.next();
			System.out.println("--"+s);
//			System.out.println("Enter a Sentence");
//			String s1= sc.nextLine();
//			System.out.println("--"+s1);
			
		}
}
