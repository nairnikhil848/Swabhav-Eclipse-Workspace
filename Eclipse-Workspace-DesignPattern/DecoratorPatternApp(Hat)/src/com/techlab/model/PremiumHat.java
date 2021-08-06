package com.techlab.model;

public class PremiumHat implements IHat{
	
	private String name;
	private double price = 1000;
	
	public PremiumHat(String name) {
		this.name = name;
	}
	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public String getDescription() {
		return "A Premium Hat by Puma. ";
	}

}
