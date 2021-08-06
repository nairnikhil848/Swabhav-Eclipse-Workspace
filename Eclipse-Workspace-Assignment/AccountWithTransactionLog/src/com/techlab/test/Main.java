package com.techlab.test;

import java.util.List;

import com.techlab.model.Account;
import com.techlab.model.Transaction;

public class Main {
	public static void main(String[] args) {

		Account acc1 = new Account(1,"Nikhil", 2000);
		acc1.deposit(1000);
		acc1.deposit(2000);
		acc1.withdraw(1000);
		
		List<Transaction> ls = acc1.getAllTransactions();
		
		for(Transaction t :ls) {
			System.out.println(t);
		}
	}
}
