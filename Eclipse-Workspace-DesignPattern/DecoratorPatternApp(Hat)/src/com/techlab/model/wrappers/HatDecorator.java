package com.techlab.model.wrappers;

import com.techlab.model.IHat;

public class HatDecorator implements IHat {

	private IHat hat;

	public HatDecorator(IHat hat) {
		this.hat = hat;
	}

	@Override
	public String getName() {
		return hat.getName();
	}

	@Override
	public double getPrice() {
		return this.hat.getPrice();
	}

	@Override
	public String getDescription() {
		return this.hat.getDescription();
	}

}
