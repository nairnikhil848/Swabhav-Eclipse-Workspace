package com.techlab.model;

public class TaxCalculator {
	LogType log;
	public TaxCalculator(LogType log) {
		this.log = log;
	}
	public int calculateTax(int amount,int rate) {
		try {
			int result = amount/rate;
			return result;
		}
		catch(Exception e){
			if(log.equals(LogType.JSON)) {
				new JSONLogger().log("Dont divide it by zero");
			}
			else if(log.equals(LogType.XML)) {
				new XMLLogger().log("Dont divide it by zero");
			}
			else if(log.equals(LogType.TXT)) {
				new TXTLogger().log("Dont divide it by zero");
			}
		}
		return  -1;
	}
}	
