package com.ustglobal.array;

public class TestA {
public static void main(String[] args) {
	int[] num = new int[5];
	num[0]=10;
	num[1]=20;
	num[2]=30;
	num[3]=40;
	num[4]=50;
	
	for(int i = 0; i < num.length;i++) {
		System.out.println(num[i]);
	}
	System.out.println("---------forEach---------");
	for(int i :num) {
		System.out.println(i);
	}
 System.out.println("-----------------------");	
 char[] ch = {'a','b','c','d'};
 for(int i=0;i<ch.length;i++) {
	 System.out.println(ch[i]);
	
 }
 System.out.println("------------");
  for(char c :ch) {
	  System.out.println(c);
  }
  System.out.println("----------");
  boolean[] b= {true,false,true};
  for(int i=0; i<b.length;i++)
  {
	  System.out.println(i);
  }
  System.out.println("--------------");
  for(boolean bool:b) {
	  System.out.println(bool);
  }
  byte[] by= {0,1,2,3,12};
  for(int i=0;i<by.length;i++) {
	  System.out.println(i);
  }
  System.out.println("------------------");
  for(byte bt:by) {
	  System.out.println(bt);
  }
  double[] db  = {89.0,56.3,786.2};
  for(double d:db) {
	  System.out.println(d);
  }
 String[] st = {"abc","xyz"};
 for(String s:st) {
	  System.out.println(s);
 }

}
}
