package com.techlab.model;

public class Account {
	private int accNo;
	private String accName;
	private double balance;
	private double minBalance = 500;
	public boolean withdrawFlag = true;
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

	public boolean withdraw(double amount) throws Exception  {
		if (this.balance - amount < minBalance) {
			withdrawFlag = false;
			throw new Exception("Withdrawal Amount is greater than minimum Balance");
			
		} else {
			this.balance -= amount;
			withdrawFlag = true;
			return withdrawFlag;
		}
	}

}
