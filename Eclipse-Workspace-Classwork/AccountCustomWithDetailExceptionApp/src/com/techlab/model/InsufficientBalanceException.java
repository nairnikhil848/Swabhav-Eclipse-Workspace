package com.techlab.model;

public class InsufficientBalanceException extends RuntimeException {
	StringBuilder str = new StringBuilder();
	String msg;
	public InsufficientBalanceException(Account acc,double amount){
		
		setMessage(acc,amount);
	}
	public void setMessage(Account acc,double amount) {
		str.append("AccNo " + acc.getAccNo());
		str.append("\n");
		str.append("Name" + acc.getAccName());
		str.append("\n");
		str.append("Balance " + acc.getBalance());
		str.append("\n");
		str.append("Not able to withdraw "+amount+" Amount");
		msg  = str.toString();
	}
	@Override
	public String getMessage() {
		return msg;
	}
}
