package com.ustglobal.accessmodifiers.pkg2;

public class Run {
public static void main(String[] args) {
	Demo d = new Demo();
	//private cannot be accesed
	/*System.out.println(d.a);
	d.add();*/
	// default
	System.out.println(d.b);
	d.sub();
	//protected
	System.out.println(d.c);
	d.mul();
	//public
	System.out.println(d.name);
	d.div();
}
}
