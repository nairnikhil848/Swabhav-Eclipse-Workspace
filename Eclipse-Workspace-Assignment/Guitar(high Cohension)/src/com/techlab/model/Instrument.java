package com.techlab.model;

public class Instrument {
	private String serialNumber;
	private double price;
	private InstrumentSpec spec;

	public Instrument(String serialNumber, double price, InstrumentSpec spec) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.spec = spec;
	}

	// Get and set methods for serial number and price
	
	public String getSerialNumber() {
		return this.serialNumber;
	}
	public double getPrice() {
		return price;
	}
	public InstrumentSpec getSpec() {
		return spec;
	}
}
