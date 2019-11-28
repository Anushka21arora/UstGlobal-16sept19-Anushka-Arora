package com.ustglobal.exception.first;

public class PVR {
	
public void book()
{    System.out.println("boking started");
	try {
		System.out.println(10/0);
		System.out.println("booking logic");
		System.out.println("Booking confirmed");
		
	} catch(ArithmeticException ae) {
		System.out.println("booking failed");
		throw ae;
	}
}
}
