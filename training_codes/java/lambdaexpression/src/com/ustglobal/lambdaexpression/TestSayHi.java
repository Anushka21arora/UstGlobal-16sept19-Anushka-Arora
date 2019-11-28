package com.ustglobal.lambdaexpression;

public class TestSayHi {
public static void main(String[] args) {
	SayHiInterface s =()->System.out.println("hii");
	s.sayHi();
}
}
