package com.techlab.model.wrappers;

import com.techlab.model.ICar;

public class SportsCar extends CarDecorator {

	public SportsCar(ICar c) {
		super(c);
	}

	@Override
	public void assemble(){
		super.assemble();
		System.out.print(" Adding features of Sports Car.");
	}
}