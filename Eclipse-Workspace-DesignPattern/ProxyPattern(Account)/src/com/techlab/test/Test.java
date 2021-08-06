package com.techlab.test;

import java.util.List;

import com.techlab.model.AccountProxy;

public class Test {

	public static void main(String[] args) {
		
		AccountProxy acc= new AccountProxy(1,"Nikhil",4000);
		acc.deposit(1000);
		acc.deposit(1000);
		
		List<String> logs = acc.getLogs();
		
		for(String log :logs) {
			System.out.println(log);
		}
	}

}
