package com.techlab.test;

import com.techlab.model.AtmProxy;

public class Test {
	public static void main(String[] args) {
		AtmProxy atm = new AtmProxy();
		System.out.println("Balance in ATM : "+atm.getCashInMachine());
		System.out.println("Balance money in ATM after 1000 outtake is :"+atm.removeCashFromMachine(1000));

	}
}
