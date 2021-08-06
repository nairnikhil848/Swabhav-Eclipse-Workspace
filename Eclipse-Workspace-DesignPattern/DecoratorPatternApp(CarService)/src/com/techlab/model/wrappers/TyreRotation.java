package com.techlab.model.wrappers;

import com.techlab.model.IService;

public class TyreRotation implements IService {

	private double cost = 100;
	private IService service;

	public TyreRotation(IService service) {
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
