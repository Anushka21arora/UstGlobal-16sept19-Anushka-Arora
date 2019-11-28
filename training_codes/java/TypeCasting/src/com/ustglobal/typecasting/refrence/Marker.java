package com.ustglobal.typecasting.refrence;

public class Marker extends Pen {
   double size;
	void color() {
    	System.out.println("Marker color()method");
    }
   @Override
	void write()
    {
    	System.out.println("marker write() method");
    }
}
