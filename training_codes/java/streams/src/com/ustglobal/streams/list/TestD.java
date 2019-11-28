package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestD {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(23);
		al.add(45);
		al.add(10);
		al.add(78);
		System.out.println("before adding 50 "+al);
		List<Integer>l = al.stream().map(i->i+50).collect(Collectors.toList());
		System.out.println("After adding 50 to each data " +l);

	}
}
