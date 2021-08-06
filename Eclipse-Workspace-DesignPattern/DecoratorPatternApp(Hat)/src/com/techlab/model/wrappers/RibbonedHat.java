package com.techlab.model.wrappers;

import com.techlab.model.IHat;

public class RibbonedHat extends HatDecorator {
	private double price = 100;

	public RibbonedHat(IHat hat) {
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

		return "Adding Ribbon to the "+super.getName()+"(Hat). " + super.getDescription();
	}

}
