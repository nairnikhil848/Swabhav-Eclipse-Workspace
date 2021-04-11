package com.techlab.model;

public abstract class Account {
	private int accNo;
	private String accName;
	private double balance;
	private boolean transFlag = true;
	
	public Account(int accno,String accName,double bal) {
		this.accNo= accno;
		this.accName = accName;
		this.balance = bal;
	}
	public abstract void withdraw(double amount);
	
	public void deposit(double amount) {
		this.balance +=amount;
	}
	public void setBalance(double amount) {
		this.balance = amount;
	}
	public int getAccNo(){
		return this.accNo;
	}
	public String getAccName(){
		return this.accName;
	}
	
	public double getBalance(){
		return this.balance;
	}
	public boolean getTransFlag() {
		return transFlag;
	}
	public void setTransFlag(boolean iflag) {
		this.transFlag = iflag;
	}
}
