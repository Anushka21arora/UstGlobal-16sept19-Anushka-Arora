package com.ustglobal.sorting.list;

import java.util.Iterator;
import java.util.TreeSet;

public class TestJ {
public static void main(String[] args) {
	//SortByName sn = new SortByName();
	//SortByPincode sp = new SortByPincode();
	SortByMicr sm = new SortByMicr();
	TreeSet<Bank> ts = new TreeSet<Bank>(sm);
	
	Bank b1 = new Bank("BOI", 451001,6740983l);
	Bank b2 = new Bank("HDFC", 451113,4689009l);
	Bank b3 = new Bank("SBI", 5610001, 1235879l);
	Bank b4 = new Bank("CANARA", 560087, 1232343l);
	Bank b5 = new Bank("CANARA", 560087, 1232343l);
	ts.add(b1);
	ts.add(b2);
	ts.add(b3);
	ts.add(b4);
	ts.add(b5);
	
	System.out.println("using iterator");
	Iterator<Bank> itr = ts.iterator();
	while (itr.hasNext()) {
		Bank bank =  itr.next();
		System.out.println("name is"+bank.name);
		System.out.println("Pincode is"+bank.pincode);
		System.out.println("MICR is "+bank.micr);
		System.out.println("--------------------");
		
	}
	
}
}
