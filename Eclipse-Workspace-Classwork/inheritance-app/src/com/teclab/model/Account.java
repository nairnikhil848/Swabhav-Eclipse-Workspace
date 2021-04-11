package com.teclab.model;

public class Account {
	private int accNo;
	private String accName;
	private double balance;
	private double minBalance = 1000;
	public boolean transFlag = true;
	private static int count;
	private static int headCount;

	static {
		count = 0;
	}
	
	public Account(int id, String name, double balance) {
		this.headCount += 1;
		this.count += 1;
		this.accNo = id;
		this.accName = name;
		this.balance = balance;
	}

	@Override
	public int hashCode() {
		System.out.println(super.hashCode());
		return  this.accNo;
	}
	@Override
	public boolean equals(Object obj) {
		Account other = (Account)obj;
		if(this.accNo == other.accNo)
			return true;
		else
			return false;
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Account other = (Account) obj;
//		if (accName == null) {
//			if (other.accName != null)
//				return false;
//		} else if (!accName.equals(other.accName))
//			return false;
//		if (accNo != other.accNo)
//			return false;
//		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
//			return false;
//		if (Double.doubleToLongBits(minBalance) != Double.doubleToLongBits(other.minBalance))
//			return false;
//		return true;
//	}

	public int getAccNo() {
		return accNo;
	}

	public int getCount() {
		return count;
	}

	public static int getheadcount() {
		return headCount;
	}

	public String getAccName() {
		return accName;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance = balance + amount;
	}

	public boolean withdraw(double amount) {
		if (this.balance - amount < minBalance) {
			transFlag = false;
			return transFlag;
		} else {
			this.balance -= amount;
			transFlag = true;
			return transFlag;
		}
	}

}
