package com.ustglobal.maps;

import java.util.Hashtable;

public class TestH {
	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<>();
		ht.put(101, "abc");
		ht.put(145, "xyz");
		ht.put(178, "pqr");
		ht.put(121, "ert");
		//ht.put(null, "abc");NullPointerException
		//ht.put(101, null);NullPointerException
		System.out.println(ht);
	}
}
