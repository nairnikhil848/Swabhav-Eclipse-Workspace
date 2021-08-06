package com.techlab.model;

public class FixedDeposit {
	private int accaNo;
	private String accName;
	private double amount;
	private double principle;
	private int years;
	private FestivalType festival;
	
	public FixedDeposit(int accaNo,String accName,double amount,double principle, int years, FestivalType festival) {
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
		if(this.festival == FestivalType.DIWALI) {
			return (double) this.principle*(1 + 0.1 *this.years);
		}
		else {
			if (this.festival == FestivalType.HOLI) {
				return (double)this.principle*(1 + 0.08 *this.years);
			}
			else {
				if(this.festival == FestivalType.NORMAL) {
					return (double) this.principle*(1 + 0.07 *this.years);
				}
			}
		
		}
		return 0;
			
	}

}
