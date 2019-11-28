package com.ustglobal.typecasting.refrence;

public class TestA {
public static void main(String[] args) {
	//up casting
	Pen p = new Marker();
	p.write();// overridden method is going executed
	System.out.println(p.cost);
	//down casting
	Marker m = (Marker)p;
	System.out.println(m.size);
	m.color();
	m.write();
	
}
}
