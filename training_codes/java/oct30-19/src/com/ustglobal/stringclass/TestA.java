package com.ustglobal.stringclass;

public class TestA {
 public static void main(String[] args) {
	String s1= "Anu";
	String s2 ="deepika";
	
	String s3 = new String("Anu");
	String s4 = new String("Anu");
	String s5="Anu";
	System.out.println(s1.equals(s2));
	System.out.println(s3.equals(s4));
	System.out.println(s1.equals(s5));
	String s6 = s1.toLowerCase();
	System.out.println(s6);
	String s7 = s1.toUpperCase();
	System.out.println(s7);
	char c = s1.charAt(0);
	System.out.println(c);

	boolean b = s1.equalsIgnoreCase("ANu");
	System.out.println(b);
	
	System.out.println("------------------------");
	StringBuffer sb = new StringBuffer("Anu");
	sb.append("xyz");
	System.out.println(sb);
}
}
