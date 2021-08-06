package com.techlab.test;

import com.techlab.model.IHat;
import com.techlab.model.PremiumHat;
import com.techlab.model.wrappers.GoldenHat;
import com.techlab.model.wrappers.RibbonedHat;

public class Test {
	public static void main(String args[]) {
		IHat hat = new RibbonedHat(new GoldenHat(new PremiumHat("Loki")));
		
		System.out.println(hat.getPrice());
		System.out.println(hat.getDescription());
		System.out.println(hat.getName());
	}
}
