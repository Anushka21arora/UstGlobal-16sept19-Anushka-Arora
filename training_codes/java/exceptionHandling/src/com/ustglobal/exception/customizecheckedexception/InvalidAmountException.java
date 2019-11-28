package com.ustglobal.exception.customizecheckedexception;

public class InvalidAmountException extends Exception{
   private String msg ="Daily limit is 40,000";
   @Override
	public String getMessage() {
		return msg;
	}
}
