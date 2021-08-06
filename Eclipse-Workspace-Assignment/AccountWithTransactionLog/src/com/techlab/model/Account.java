package com.techlab.model;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private int accNo;
	private String accName;
	private double balance;
	private double minBalance = 1000;
	List<Transaction> logs = new ArrayList<Transaction>();


	public Account(int Accno,String name, double balance) {
		this.accNo = Accno;
		this.accName = name;
		this.balance = balance;
		logs.add(new Transaction(Type.DEPOSIT,balance));
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

	public void deposit(double amount) {
		logs.add(new Transaction(Type.DEPOSIT,amount));
		balance = balance + amount;
	}

	public boolean withdraw(double amount) {
		boolean withdrawalFlag;
		
		if (this.balance - amount < minBalance) {
			withdrawalFlag = false;
			return withdrawalFlag;
		} else {
			this.balance -= amount;
			withdrawalFlag = true;
			logs.add(new Transaction(Type.WITHDRAW,amount));
			return withdrawalFlag;
		}
	}
	public List<Transaction> getAllTransactions() {
		return logs;
	}

}
