package com.ustglobal.objectclass;

public class TestA {
public static void main(String[] args) {
	Pen p = new Pen();
	int phashCode = p.hashCode();
	System.out.println("HashCode is "+phashCode);
	
	Pen q = new Pen();
	int qhashCode = q.hashCode();
	System.out.println("HashCode is "+qhashCode);
}
}
