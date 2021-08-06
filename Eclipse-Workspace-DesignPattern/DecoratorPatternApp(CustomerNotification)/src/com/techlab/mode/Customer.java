package com.techlab.mode;

public class Customer {
	private String name;
	private int number;
	private String email;
	private String facebookId;
	private String msg;
	public Customer(String name,int number,String email,String facebookid,String msg) {
		this.name =name;
		this.number = number;
		this.email = email;
		this.facebookId = facebookid;
		this.msg = msg;
	}
	public String getName() {
		return this.name;
	}
	public int getNumber() {
		return this.getNumber();
	}
	public String getemail() {
		return email;
	}
	public String getFacebookId() {
		return facebookId;
	}
	public String getMessage() {
		return msg;
	}
}
