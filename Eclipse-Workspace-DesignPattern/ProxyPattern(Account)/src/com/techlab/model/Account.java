package com.techlab.model;

public class Account implements IAccount{
	private int accNo;
	private String accName;
	private double balance;


	public Account(int accno,String name, double balance) {
		this.accName = name;
		this.balance = balance;
		this.accNo = accno;
	}

	public int getAccNo() {
		return accNo;
	}

	public String getAccName() {
		return accName;
	}

	public double getBalance() {
		return balance;
	}
	@Override
	public void deposit(double amount) {
		balance = balance + amount;
	}
	@Override
	public void withdraw(double amount) {
		balance = balance - amount;
	}

}
