package com.ustglobal.atmmachine;

public class ICICI implements ATM{

	@Override
	public void validateCard() {
		System.out.println("validate card of ICICI");
	}

	@Override
	public void getInfo() {
		System.out.println("GEt info of ICICI");
	}

}
