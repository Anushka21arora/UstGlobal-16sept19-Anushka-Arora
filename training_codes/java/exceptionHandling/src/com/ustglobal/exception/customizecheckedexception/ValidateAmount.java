package com.ustglobal.exception.customizecheckedexception;

public class ValidateAmount {
 void checkAmount(int amount) throws InvalidAmountException {
	 if(amount >40000) {
		 
		 throw new InvalidAmountException();
	 }
 }
}
