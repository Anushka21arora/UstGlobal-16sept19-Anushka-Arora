package com.ustglobal.objectclass;

public class TestE {
public static void main(String[] args) {
	Cow c = new Cow(1, "ganga", 100000);
	Cow c1 = new Cow(2, "jamuna", 200000);
	Cow c2 = new Cow(1, "ganga", 100000);
	Cow c4 = c2;
System.out.println(c.equals(c1));
System.out.println(c1.equals(c2));
System.out.println(c2.equals(c));
System.out.println(c4.equals(c2));
}
}
