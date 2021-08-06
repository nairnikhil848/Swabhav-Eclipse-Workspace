package com.techlab.model;

public class SmsNotifier implements INotifier {

	@Override
	public void notify1(Account acc) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("New SMS notification found");
		System.out.println("Updated Balance" +acc.getBalance());
	}

}
