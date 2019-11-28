package com.ustglobal.thread.pausing;

public class TestA {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();

		Runnable r1 = () -> {
			synchronized (obj1) {
				System.out.println("t1 started");
				System.out.println("t1 has locked obj1");
				try {
					obj1.wait();
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				synchronized (obj2) {
					System.out.println("t1 has locked obj2");
				}

			}
			System.out.println("t1 finished");
		};
		Runnable r2 = () -> {
			synchronized (obj2) {
				System.out.println("t2 started");
				System.out.println("t2 has locked obj2");
				synchronized (obj1) {
					System.out.println("t2 has locked obj1");
					obj1.notify();
					//obj1.notifyAll();
				}

			}
			System.out.println("t2 finished");
		};
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();

	}

}
