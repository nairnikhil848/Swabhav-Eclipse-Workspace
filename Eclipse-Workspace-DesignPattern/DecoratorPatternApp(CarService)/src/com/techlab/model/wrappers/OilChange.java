package com.techlab.model.wrappers;

import com.techlab.model.IService;

public class OilChange implements IService {

	private double cost = 500;
	private IService service;

	public OilChange(IService service) {
		this.service = service;
	}

	@Override
	public double totalCost() {
		return this.service.totalCost() + cost;
	}

	@Override
	public String getDetatils() {
		return "Changing the Oil. " + this.service.getDetatils();
	}

}
