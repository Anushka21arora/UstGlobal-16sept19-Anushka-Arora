package com.ustglobal.google;

public class TestA {
public static void main(String[] args) {
	Browser b = new Browser();
	Google g1 = new Gmail(); 
	Google g2 = new  GoogleDrive();
	b.open(g1);
	b.open(g2);
	
}
}
