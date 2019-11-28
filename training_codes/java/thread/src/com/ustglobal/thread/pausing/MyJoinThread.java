package com.ustglobal.thread.pausing;

public class MyJoinThread extends Thread{
 @Override
public void run() {
	for(int i = 0;i<10;i++) {
		System.out.println("chlid thread");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
}
