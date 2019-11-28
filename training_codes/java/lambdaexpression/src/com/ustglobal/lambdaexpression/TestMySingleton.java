package com.ustglobal.lambdaexpression;

public class TestMySingleton {
 public static void main(String[] args) {

	 MySingleton ms = MySingleton.getDbConnection();
	ms.s="hello";
	System.out.println("hashcode of Ms :" +ms.hashCode());
	MySingleton ms1 = MySingleton.getDbConnection();
	ms1.s="hii";
	System.out.println("hashcode of Ms1 :" +ms1.hashCode());
	System.out.println(ms.s);//hii
	System.out.println(ms1.s);//hii modifying the older one bcoz pointing to same object
}
}
