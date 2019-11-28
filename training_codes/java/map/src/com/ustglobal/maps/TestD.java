package com.ustglobal.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestD {
public static void main(String[] args) {
	LinkedHashMap<String,Integer> lh = new LinkedHashMap<String,Integer>();
	lh.put("banglore", 560068);
	lh.put("Indore", 452001);
	lh.put("khargone", 451001);
	lh.put("Bediya", 451113);
	for(Map.Entry<String, Integer> m :lh.entrySet()) {
		String key = m.getKey();
		Integer val = m.getValue();
		System.out.println("key is "+key +" ," +"value is "+val);
	}
}
}
