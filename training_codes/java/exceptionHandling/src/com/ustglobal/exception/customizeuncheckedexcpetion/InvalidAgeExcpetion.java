package com.ustglobal.exception.customizeuncheckedexcpetion;

public class InvalidAgeExcpetion extends RuntimeException {

	String msg ="Invalid age below 18 years not allowed";
 
	public  InvalidAgeExcpetion() {
		
	}
	public InvalidAgeExcpetion(String msg) {
		this.msg=msg;
	}
//	@Override
//	public String getMessage() {
//		return msg;
//	}
	@Override
	public String toString() {
		return "InvalidAgeExcpetion [msg=" + msg + "]";
	}
	
}
