package com.techlab.model;

public class StandardHat implements IHat {
	
	private String name;
	private double price = 500;
	
	
	public StandardHat(String name) {
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
		return "A Standard Hat by Hamms. ";
	}
}
