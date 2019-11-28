package com.ustglobal.accessmodifiers.pkg1;

import com.ustglobal.accessmodifiers.pkg2.Demo;

public class Sample extends Demo{
public static void main(String[] args) {
	Demo d = new Demo();
	//private cannot be accesed
	/*System.out.println(d.a);
	d.add();*/
	// default cnnot possible
	/*System.out.println(d.b);
	d.sub();*/
	Sample s = new Sample();
	//protected
	System.out.println(s.c);
	s.mul();
	//public
	System.out.println(d.name);
	d.div();
}
}
