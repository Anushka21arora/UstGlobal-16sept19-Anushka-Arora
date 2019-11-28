package com.ustglobal.hasarelationship.weak;

public class TestB {
public static void main(String[] args) {
	Car c = new Car();
	System.out.println("Car Brand "+c.brand);
	System.out.println("Car Color "+c.color);
	c.move();
	System.out.println("Music type "+c.m.type);//has a relationship
	System.out.println("Singer "+c.m.singer);
	c.m.playMusic();
}
}
