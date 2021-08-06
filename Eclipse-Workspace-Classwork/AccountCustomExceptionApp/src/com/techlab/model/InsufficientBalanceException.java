package com.techlab.model;

public class InsufficientBalanceException extends RuntimeException {
	

	public InsufficientBalanceException(String s){
		super(s);
	}
}
