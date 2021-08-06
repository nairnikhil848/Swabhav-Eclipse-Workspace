package com.techlab.models;

import java.time.LocalDateTime;

public class BankTransaction {
	private String id;
	private double amount;
	private char type;
	private LocalDateTime date;

	public BankTransaction(String id, double amount, char type, LocalDateTime date) {
		this.id = id;
		this.amount = amount;
		this.type = type;
		this.date = date;
	}

	public String getId() {
		return id;
	}

	public double getAmount() {
		return amount;
	}

	public char getType() {
		return type;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void setType(char type) {
		this.type = type;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

}
