package com.ustglobal.lambdaexpression;

public class Testfactorial {
	public static void main(String[] args) {
		FactorialInterface fac = (num)->{
			int f=1;
			for(int i=1;i<=num;i++) {
				f=f*i;  
			}
			return f;
		};
		int factorial=fac.fact(5);
		System.out.println("factorial is"+factorial);
	}
	

}
