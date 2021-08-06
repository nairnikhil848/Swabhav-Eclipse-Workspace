package com.techlab.model.wrappers;

import com.techlab.model.ICar;

public class CarDecorator implements ICar {

	protected ICar car;
	
	public CarDecorator(ICar c){
		this.car=c;
	}
	
	@Override
	public void assemble() {
		this.car.assemble();
	}

}
