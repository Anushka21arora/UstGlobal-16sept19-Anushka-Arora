package com.ustglobal.customeImmutableclass;

public class TestString {
public static void main(String[] args) {
	MyString ms = new MyString(10, "anu");
	System.out.println(ms.getRollno());
	System.out.println(ms.getName());
	MyString ms1 =ms.changeContent(20, "vaibhav");
	System.out.println(ms.getRollno());
	System.out.println(ms.getName());
	System.out.println("------------------------");
	System.out.println(ms1.getRollno());
	System.out.println(ms1.getName());

}
}
