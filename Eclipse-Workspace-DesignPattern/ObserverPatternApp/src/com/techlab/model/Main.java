package com.techlab.model;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc1 = new Account(1,"Nikhil",5000);
		acc1.addNotifier(new SmsNotifier());
		acc1.addNotifier(new EmailNotifier());
		
		acc1.deposit(1000);
		acc1.sendNotification();
	}

}
