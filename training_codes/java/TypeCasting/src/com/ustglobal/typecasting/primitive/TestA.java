package com.ustglobal.typecasting.primitive;

public class TestA {
     public static void main(String[] args) {
		//implicit type casting
    	 byte a = 10;
    	 int b= a;
    	 System.out.println("b is"+b);
    	 //explicit type casting
    	 double x= 98.53;
    	 int y = (int)x;
    	 System.out.println("y is "+y);
    	 byte z = (byte)x;
    	 System.out.println("z is "+z);
    	 char r  = (char)x;
    	 System.out.println("r is "+r);
	}
}
