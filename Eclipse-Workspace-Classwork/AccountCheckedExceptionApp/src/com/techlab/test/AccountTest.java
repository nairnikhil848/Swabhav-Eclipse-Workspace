package com.techlab.test;

import com.techlab.model.Account;

public class AccountTest {
	public static void main(String[] args) {

		Account acc1 = new Account("Nikhil", 1000);
		try {	
			acc1.withdraw(600);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		if(acc1.withdrawFlag) {
			printInfo(acc1);
		}
	
	}
	private static void printInfo(Account acc) {
		System.out.println("AccNo " + acc.getAccNo());
		System.out.println("Name" + acc.getAccName());
		System.out.println("Balance " + acc.getBalance());
	}
}
