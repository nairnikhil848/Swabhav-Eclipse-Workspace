package com.techlab.test;

import com.techlab.model.Account;
import com.techlab.model.CurrentAccount;
import com.techlab.model.SavingAccount;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrentAccount curracc = new CurrentAccount(1,"Nikhil",5000);
		curracc.deposit(1000);
		curracc.withdraw(2000);
		if(curracc.getTransFlag()) {
			printInfo(curracc);
		}
		else {
			System.out.println("Your Account's Balance is Below of our policy's minimum Balance ");
		}
		SavingAccount savacc = new SavingAccount(2,"N2",6000);
		savacc.deposit(1000);
		savacc.withdraw(6800);
		if(savacc.getTransFlag()) {
			printInfo(savacc);
		}
		else {
			System.out.println("Your Account's Balance is Below of our policy's minimum Balance ");
		}
		
	}

	private static void printInfo(Account acc) {
		// TODO Auto-generated method stub
		System.out.println("Account no: "+acc.getAccNo());
		System.out.println("Account Name: "+acc.getAccName());
		System.out.println("Balance: "+acc.getBalance());
	}

}
