package com.ustglobal.java8feature;

import java.util.function.Function;

public class TestC {
public static void main(String[] args) {
	Function<Integer, Integer> f = i->i*i;
	int  i = f.apply(10);
	System.out.println("Sqaure of 10 is "+i);
	int ii =f.apply(23);
	System.out.println("square of 23 is "+ii);
}

}
