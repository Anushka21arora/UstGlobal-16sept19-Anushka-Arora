package com.ustglobal.objectclass;

public class TestB {
 public static void main(String[] args) {
	Marker m = new Marker();
	String s = m.toString();
	int h = m.hashCode();
	System.out.println("toString is "+s);
	System.out.println("hashcode is "+h);
}
}
