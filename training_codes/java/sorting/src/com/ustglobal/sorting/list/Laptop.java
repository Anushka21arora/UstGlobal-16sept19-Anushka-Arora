package com.ustglobal.sorting.list;

public class Laptop implements Comparable<Laptop> {
double price;
int ram ;
String name;
public Laptop(double price, int ram, String name) {
	super();
	this.price = price;
	this.ram = ram;
	this.name = name;
}
//@Override
//	public int compareTo(Laptop o) {
//		Integer i= this.ram;
//		Integer j= o.ram;
//		return i.compareTo(j);
//	}
@Override
public int compareTo(Laptop o) {
	Double i= this.price;
	Double j= o.price;
	return i.compareTo(j);
}
//@Override
//public int compareTo(Laptop o) {
//	
//	return this.name.compareTo(o.name);
//}
}
