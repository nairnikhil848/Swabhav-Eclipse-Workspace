package com.techlab.model;

public class FixedDeposit {
	private int accaNo;
	private String accName;
	private double amount;
	private double principle;
	private int years;
	private iFestivalRate festival;
	
	public FixedDeposit(int accaNo,String accName,double amount,double principle, int years, iFestivalRate festival) {
		this.accaNo = accaNo;
		this.accName = accName;
		this.amount = amount;
		this.principle = principle;
		this.years = years;
		this.festival = festival;
	}
	
	public int getAccno() {
		return this.accaNo;
	}
	public String getAccName() {
		return this.accName;
	}
	public double getAmount() {
		return this.amount;
	}
	public int getYears() {
		return this.years;
	}
	public double calculateSimpleInterst() {
		return (double) (this.principle * this.years * festival.getRate())/100;
		//return (double) this.principle*(1 + festival.getRate() *this.years);
			
	}

}
