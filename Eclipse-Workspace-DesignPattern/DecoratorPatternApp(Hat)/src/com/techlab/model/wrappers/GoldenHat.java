package com.techlab.model.wrappers;

import com.techlab.model.IHat;

public class GoldenHat extends HatDecorator {

	private double price = 200;

	public GoldenHat(IHat hat) {
		super(hat);
	}

	@Override
	public String getName() {
		return super.getName();
	}

	@Override
	public double getPrice() {
		return super.getPrice() + price;
	}

	@Override
	public String getDescription() {

		return "Adding Golden Color to the "+super.getName()+"(Hat). "+ super.getDescription();
	}

}
