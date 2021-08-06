package com.techlab.models;

import java.util.UUID;

public class AccountHolder {
	private String id;
	private String name;
	private String password;
	private double balance;

	public AccountHolder(String name, double balance, String password) {
		this.id = UUID.randomUUID().toString();
		this.name = name;
		this.password = password;
		this.balance = balance;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public String getPassword() {
		return password;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
