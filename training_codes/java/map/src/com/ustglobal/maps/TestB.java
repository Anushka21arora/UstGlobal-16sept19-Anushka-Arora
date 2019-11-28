package com.ustglobal.maps;

import java.io.ObjectOutputStream.PutField;
import java.util.HashMap;

public class TestB {
  public static void main(String[] args) {
	 HashMap hm = new HashMap();
	  hm.put("kuku", 5678);
		hm.put("mala", 67890);
		hm.put("sheela", 78790);
		HashMap hm1 = new HashMap<>();
		hm1.put("avc", 546567);
		hm1.put("dfas", 567657);
		hm1.put("mjhm", 978968);
		boolean hasKey = hm.containsKey("mala");//returns true and false
		System.out.println("Has Key "+hasKey);
		boolean hasValue = hm.containsValue(5678);
		System.out.println("Has Value "+hasValue);
		hm.putAll(hm1);//copy one hash map to another or merge two map
		System.out.println("after putall "+hm);
		System.out.println(hm.size());//checks the size
		System.out.println(hm.isEmpty());//check map is empty or not
		hm.clear();
		System.out.println("After clear "+hm);
}
}
