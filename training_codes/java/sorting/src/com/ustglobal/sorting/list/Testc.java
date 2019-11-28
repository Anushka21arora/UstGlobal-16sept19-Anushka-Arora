package com.ustglobal.sorting.list;

import java.util.LinkedList;

public class Testc {
public static void main(String[] args) {
	LinkedList<Integer> l = new LinkedList<>();
	l.add(12);
	l.add(13);
	l.add(45);
	l.add(34);
	Integer peekElement = l.peek();
	System.out.println("Peek element"+peekElement);
	Integer peekFirstEle = l.peekFirst();
	System.out.println("first peek element"+peekFirstEle);
	Integer peekLastele =l.peekLast();
	System.out.println("last ele"+peekLastele);
	System.out.println("After peek--->"+l);
	
	System.out.println("-------------------");
	Integer pollEle =l.poll();
	System.out.println("poll element"+pollEle);
	Integer pollFirst = l.pollFirst();
	System.out.println("first poll"+pollFirst);
	Integer pollLast =l.pollLast();
	System.out.println("last poll"+pollLast);
	System.out.println("after poll--->"+l);
	
	
	l.push(12);
	System.out.println("After push "+l);
	Integer p = l.pop();
	System.out.println(p);
	System.out.println("after pop"+l);
	
}
}
