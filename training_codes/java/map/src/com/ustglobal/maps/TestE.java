package com.ustglobal.maps;


import java.util.Map;
import java.util.TreeMap;

public class TestE {
public static void main(String[] args) {
	TreeMap<String,Integer> lh = new TreeMap<String,Integer>();
	lh.put("banglore", 560068);
	lh.put("indore", 452001);
	lh.put("khargone", 451001);
	lh.put("bediya", 451113);
	System.out.println(lh);
	for(Map.Entry<String, Integer> m:lh.entrySet()) {
		String key= m.getKey();
		Integer val =m.getValue();
		System.out.println("key "+key);
		System.out.println("value "+val);
		System.out.println("--------------------");
	}
}
}
