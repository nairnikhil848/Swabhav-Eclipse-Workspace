package com.techlab.model;

public class TaxCalculator {
	ILogger log;
	public TaxCalculator(ILogger log) {
		this.log = log;
	}
	public int calculateTax(int amount,int rate) {
		try {
			int result = amount/rate;
			return result;
		}
		catch(Exception e){
			log.log("Dont divide it by zero");
		}
		return  -1;
	}
}	
