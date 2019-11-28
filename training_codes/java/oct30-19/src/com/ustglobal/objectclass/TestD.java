package com.ustglobal.objectclass;

public class TestD {
public static void main(String[] args) {
	Car c = new Car(120000, "bmw", "white");
	Car c1 = new Car(5000000, "Audi", "black");
	Car c2 = new Car(30000, "maruti", "white");
	int carhashcode = c.hashCode();
	System.out.println("Cost of bmw is "+carhashcode);
	System.out.println(c);
	int car1hashcode = c1.hashCode();
	System.out.println("Cost of audi is "+car1hashcode);
	System.out.println(c1);
	int car2hashcode = c2.hashCode();
	System.out.println("Cost of maruti is "+car2hashcode);
	System.out.println(c2);
	
}
}
