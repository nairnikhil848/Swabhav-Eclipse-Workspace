package com.teclab.test;

import com.teclab.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc1 = new Account(1,"abc",20);
		Account acc2 = new Account(1,"abc",20);
		System.out.println(acc1==acc2);
		System.out.println(acc1.equals(acc2));
		System.out.println(acc1.hashCode());
		System.out.println(acc2.hashCode());
	}

}
