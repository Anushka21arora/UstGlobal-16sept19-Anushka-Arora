package com.ustglobal.exception.first;

public class PayTm {
void book() {
	System.out.println("paytm started");
	IRCTC i = new IRCTC();
	i.confrim();
	
	System.out.println("paytm ended");
}
}
