package com.techlab.model;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class AccountProxy  implements IAccount{
	
	private int accNo;
	private List<String> logs;
	private String accName;
	private double balance;
	
	private Account acc;
	
	
	
	public AccountProxy(int accno,String name, double balance) {
		this.accName = name;
		this.balance = balance;
		this.accNo = accno;
		logs = new ArrayList();
	}

	@Override
	public void deposit(double amount) {
		LocalTime  stime = LocalTime.now();
		if(this.acc == null) {
			this.acc = new Account(accNo,accName,balance);
		}
		acc.deposit(amount);
		LocalTime  etime = LocalTime.now();
		logs.add("Deposit Start time :"+stime +" Deposit End time :" + etime);
	}

	@Override
	public void withdraw(double amount) {
		LocalTime  stime = LocalTime.now();
		System.out.println("Withdraw Start time :" + LocalTime.now());
		if(this.acc == null) {
			this.acc = new Account(accNo,accName,balance);
		}
		acc.withdraw(amount);
		LocalTime  etime = LocalTime.now();
		logs.add("Withdraw Start time :"+stime +" Withdraw End time :" + etime);
		
	}
	public List getLogs() {
		return logs;
	}

}
