package com.ustglobal.thread;

public class TestRunnable {
public static void main(String[] args) {
	MyRunnable mr = new MyRunnable();
	//mr.start; start() is undefined in MyRunable
	Thread t1= new Thread(mr);//overloaded constructor
	t1.start();
	for(int i= 0 ; i<10;i++) {
		System.out.println("main thread");
	}
	System.out.println("main ended");
}
}
