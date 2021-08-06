package com.techlab.model;

import java.time.LocalDate;

public class Transaction {
	private double amount;
	private Type type;
	private LocalDate myObj;
	
	public Transaction(Type type,double amount) {
		this.type = type;
		myObj = LocalDate.now();
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append(type+"\t"+amount+"\t"+myObj);
		return str.toString();
	}
	
}
