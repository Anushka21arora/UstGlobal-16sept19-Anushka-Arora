package com.ustglobal.atmmachine;

public class Test {
 public static void main(String[] args) {
	Machine m = new Machine();
	 HDFC h1 = new HDFC();
	m.slot(h1);

	ICICI icici = new ICICI();
	m.slot(icici);
	
	SBI sbi = new SBI();
	m.slot(sbi);
}
}
