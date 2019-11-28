package com.ustglobal.thread.properties;

public class MyThread extends Thread{
	public static void main(String[] args) {
		System.out.println("main started");
		
		String tname = Thread.currentThread().getName();//get the name of current thread
		System.out.println("Current thread "+tname);
		
		MyThread t1 = new MyThread();
		String name = t1.getName();
		System.out.println("My thread name " +name);
		
		Thread.currentThread().setName("Anuu");
		
		t1.setName("golu");
		System.out.println("my thread name "+t1.getName());
		
		System.out.println(10/0);
		System.out.println("main ended");
	}
}
