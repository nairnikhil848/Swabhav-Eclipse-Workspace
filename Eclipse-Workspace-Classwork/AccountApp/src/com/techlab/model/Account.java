package com.techlab.model;

public class Account {
	private int accNo;
	private String accName;
	private double balance;
	private double minBalance = 1000;
	public boolean transFlag = true;
	private static int count;
	private static int headCount;

	static {
		count = 100;
	}

	public Account(String name, double balance) {
//		this.headCount += 1;
		this.count += 1;
		this.accNo = count;
		this.accName = name;
		this.balance = balance;
	}

	public int getAccNo() {
		return accNo;
	}

	public int getCount() {
		return count;
	}

	public static int getheadcount() {
		return headCount;
	}

	public String getAccName() {
		return accName;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance = balance + amount;
	}

	public boolean withdraw(double amount) {
		if (this.balance - amount < minBalance) {
			transFlag = false;
			return transFlag;
		} else {
			this.balance -= amount;
			transFlag = true;
			return transFlag;
		}
	}

}
