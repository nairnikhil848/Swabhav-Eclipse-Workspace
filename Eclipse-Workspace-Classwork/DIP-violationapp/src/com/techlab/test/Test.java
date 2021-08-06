package com.techlab.test;

import com.techlab.model.LogType;
import com.techlab.model.TaxCalculator;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaxCalculator cal = new TaxCalculator(LogType.JSON);
		cal.calculateTax(100, 0);
		
		
	}

}
