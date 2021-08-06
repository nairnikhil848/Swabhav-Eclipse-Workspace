package com.techlab.test;

import com.techlab.model.Account;

public class AccountTest {

	public static void main(String[] args) {

		Account acc1 = new Account("Nikhil", 2000);

		Account acc2 = new Account("Nikhil1", 4000);

		Account acc3 = new Account("Nikhil2", 5000);
		printInfo(acc1);
		printInfo(acc2);
		printInfo(acc3);
		
		
		

	}

	private static void withdrawCash(Account acc, double amount) {
		acc.withdraw(amount);
		if (acc.withdraw(amount)) {
			printInfo(acc);
			System.out.println("amount Withdrawal successfull\n");

		} else {
			System.out.println("Withdrawal amount greater than balance\n");
		}
	}

	private static void printInfo(Account acc) {
		System.out.println("AccNo " + acc.getAccNo());
		System.out.println("Name" + acc.getAccName());
		System.out.println("Balance " + acc.getBalance());
	}

}
