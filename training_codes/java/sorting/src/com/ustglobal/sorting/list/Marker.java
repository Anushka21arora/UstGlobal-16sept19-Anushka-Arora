package com.ustglobal.sorting.list;

public class Marker {
double price;
String color;
public Marker(double price, String color) {
	super();
	this.price = price;
	this.color = color;
}

@Override
public String toString() {
	return "Marker [price=" + price + ", color=" + color + "]";
}

}
