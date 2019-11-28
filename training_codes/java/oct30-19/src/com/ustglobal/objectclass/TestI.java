package com.ustglobal.objectclass;

public class TestI {
	public static void main(String[] args) throws CloneNotSupportedException {
		Person p = new Person(12, "anu");
		System.out.println("p id is "+p.id);
		System.out.println("p name is "+p.name);

		Object o = p.clone();
		Person p1 = (Person)o;
		System.out.println("p1 id is "+p1.id);
		System.out.println("p1 name is "+p1.name);
		p1.id=20;
		p1.name="vaibhav";
		System.out.println("------After Coloning------------");
		System.out.println("p1 id is "+p1.id);
		System.out.println("p1 name is "+p1.name);
	}
}
