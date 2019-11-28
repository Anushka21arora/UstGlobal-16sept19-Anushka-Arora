package com.ustglobal.hasarelationship.weak;

public class TestA {
  public static void main(String[] args) {
	Person p = new Person();
	p.name="anu";
	System.out.println(p.name);
	p.eat();
	p.sleep();
	System.out.println(p.m.color);
	p.m.write();// Association 
}
}
