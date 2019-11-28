package com.ustglobal.lambdaexpression;

public class TestGreet {
public static void main(String[] args) {
	GreetInterface gt = (message)->{
    System.out.println("hello");
	System.out.println(message);
	};
	gt.greet(" Anushka");
	
	}
}

