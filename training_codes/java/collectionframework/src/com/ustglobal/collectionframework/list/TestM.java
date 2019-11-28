package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Collections;

public class TestM {
public static void main(String[] args) {
	ArrayList<String> al = new ArrayList<>();
	al.add("anu");
	al.add("jaggu");
	al.add("pari");
	al.add("kittu");
	System.out.println("before sort-->"+al);
	Collections.sort(al);
	System.out.println("After sort-->"+al);
}
}
