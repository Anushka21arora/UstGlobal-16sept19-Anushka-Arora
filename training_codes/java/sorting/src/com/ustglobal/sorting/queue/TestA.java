package com.ustglobal.sorting.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestA {
public static void main(String[] args) {
	PriorityQueue<Integer>pq = new PriorityQueue<Integer>();
	pq.add(12);
	pq.add(34);
	//pq.add("hello");only generics
	//pq.add(null);no null allowed
	pq.offer(1);
	System.out.println("using iterator");
	Iterator<Integer> itr = pq.iterator();
	while (itr.hasNext()) {
		
		System.out.println(pq.poll());
	}
	System.out.println("after poll"+pq);
}
}
