package com.ustglobal.maps;

import java.util.HashMap;

import javax.jws.soap.SOAPBinding;

public class TestA {
public static void main(String[] args) {
	HashMap hm = new HashMap<>();
	hm.put("kuku", 5678);
	hm.put("mala", 67890);
	hm.put("sheela", 78790);
	hm.put(null, 67842);
	hm.put(null, 223334);
	
	System.out.println("data "+hm);
	hm.put("mala", 78908);
	System.out.println("after modify "+hm);
	hm.put("dimpi", 78908);
	System.out.println("after adding dimpi "+hm);
	
	System.out.println("after null "+hm);
	System.out.println("------------------------");
	System.out.println("after adding duplicate null");
	System.out.println(hm);
	System.out.println("-----------------");
	Object phnno = hm.get("sheela");
	System.out.println("value "+phnno);
	System.out.println("------------------------");
	System.out.println("value is "+hm.get("anu"));
	System.out.println("----------------");
	System.out.println("removed value is "+hm.remove("kuku"));
	System.out.println("after removing "+hm);
	
}
}
