package com.ustglobal.lambdaexpression;

public class TestSquare {
public static void main(String[] args) {
	SquareInterface si= x->x*x;
	int sq = si.square(4);
	System.out.println(sq);
}
}
