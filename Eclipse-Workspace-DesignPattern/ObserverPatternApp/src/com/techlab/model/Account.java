package com.techlab.model;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private int accno;
	private String name;
	private double balance;
	List<INotifier> notifiers;
	
	public Account(int accno,String name,double balance) {
		notifiers = new ArrayList<INotifier>();
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}
	public void deposit(double amount) {
		balance += amount;
	}
	public void withdraw(double amount) {
		balance -= amount;
	}
	public void addNotifier(INotifier notifier) {
		notifiers.add(notifier);
	}
	public double getBalance() {
		return balance;
	}
	public void sendNotification() {
		for(INotifier notifier :notifiers) {
			notifier.notify1(this);
		}
	}
}
