package com.techlab.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountTest {

	@Test
	void testAccount() {
		
		//arrange
		int expectedaccno = 101;
		String expectedaccname = "nikhil";
		double expectedbalance = 2000;
		
		//act
		Account acc = new Account("nikhil",2000);
		//assert
		assertEquals(expectedaccno,acc.getCount());
		assertEquals(expectedaccname,acc.getAccName());
		assertEquals(expectedbalance,acc.getBalance());
		
	}

	@Test
	void testDeposit() {
		//arrange
		double expectedbalance = 5000;
		
		//act
		Account acc = new Account("nikhil",4000);
		acc.deposit(1000);
		
		//assert
		assertEquals(expectedbalance,acc.getBalance());
	}

	@Test
	void testWithdraw() {
		//arrange
		double expectedbalance = 3000;
		
		//act
		Account acc = new Account("nikhil",4000);
		acc.withdraw(1000);
		
		//assert
		assertEquals(expectedbalance,acc.getBalance());
	}

}
