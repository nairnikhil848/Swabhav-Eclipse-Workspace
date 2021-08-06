package com.techlab.model;

public class EmailNotifier implements INotifier {

	@Override
	public void notify1(Account acc) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("New Email Notification found ");
		System.out.println("Updated Balance" +acc.getBalance());
	}
	
}
