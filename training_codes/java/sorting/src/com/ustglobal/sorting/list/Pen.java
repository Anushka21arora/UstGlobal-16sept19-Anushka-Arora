package com.ustglobal.sorting.list;

public class Pen implements Comparable<Pen> {
double price;
String brand;
String color;
public Pen(double price, String brand,String color) {
	super();
	this.price = price;
	this.brand = brand;
	this.color = color;
}

@Override
public String toString() {
	return "Pen [price=" + price + ", brand=" + brand + ", color=" + color + "]";
}


//@Override
//	public int compareTo(Pen o) {
//		
//		return this.brand.compareToIgnoreCase(o.brand);
//	}
//@Override
//	public int compareTo(Pen o) {
//		if(this.price>o.price) {
//			return -1;
//		}else if(this.price<o.price) {
//			return 1;
//		}else {
//			return 0;
//		}
//	}
@Override
	public int compareTo(Pen o) {
		return this.color.compareTo(o.color);
	}
}
