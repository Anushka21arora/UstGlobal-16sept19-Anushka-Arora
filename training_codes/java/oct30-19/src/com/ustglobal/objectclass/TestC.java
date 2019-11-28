package com.ustglobal.objectclass;

public class TestC {
      public static void main(String[] args) {
		  Student s = new Student(1, "anu", 82.3);
		  int hashcode= s.hashCode();
		  System.out.println(" overrridden hashcode is "+hashcode);
		  System.out.println(s);
		 
		  
	}
}
