package com.ustglobal.array;

public class TestB {
public static void main(String[] args) {
	int[] num = {10,20,30};
	receive(num);
	int[] values=getArray();
	for(int vals:values) {
		System.out.println(vals);
	}
	String[] s =getString();
	for(String str:s) {
		System.out.println(str);
	}

	
}
static void receive(int[] numbers) {
	for(int nums :numbers) {
		System.out.println(nums);
	}
}
static int[] getArray() {
	int[] values= {20,30,40};
	return values;
}
static String[] getString() {
	String[] st = {"we","are","doing"};
	return st;
}

}
