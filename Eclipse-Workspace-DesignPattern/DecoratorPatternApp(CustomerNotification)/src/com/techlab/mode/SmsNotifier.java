package com.techlab.mode;

public class SmsNotifier implements INotifier {

	private Customer cust;

	public SmsNotifier(Customer cust) {
		this.cust = cust;
	}

	@Override
	public String sendMessage() {
		return " New Email from "+cust.getemail() +" : "+ cust.getMessage();

	}

	@Override
	public Customer getDetails() {
		// TODO Auto-generated method stub
		return cust;
	}

}
