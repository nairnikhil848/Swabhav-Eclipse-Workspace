package com.techlab.model;

public class SavingAccount extends Account{
	private final int minBalance = 500;
	
	public SavingAccount(int accno, String accName, double bal) {
		super(accno, accName, bal);
	}
	public void withdraw(double amount) {
		if(this.getBalance() - amount < minBalance) {
			super.setTransFlag(false);
		}
		else {
			this.setBalance(this.getBalance()-amount);
		}
	}

}
