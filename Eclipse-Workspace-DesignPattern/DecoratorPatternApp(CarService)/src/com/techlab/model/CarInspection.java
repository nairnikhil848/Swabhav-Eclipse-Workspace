package com.techlab.model;

public class CarInspection implements IService {

	private double cost = 1000;

	@Override
	public double totalCost() {
		return cost;
	}

	@Override
	public String getDetatils() {
		return "Inspecting the Car.";
	}

}
