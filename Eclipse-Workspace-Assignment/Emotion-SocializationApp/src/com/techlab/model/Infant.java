package com.techlab.model;

public class Infant implements IEmotionable,ISocialization{

	@Override
	public void depart() {
		// TODO Auto-generated method stub
		System.out.println("Departing.. Infant");
	}

	@Override
	public void wish() {
		// TODO Auto-generated method stub
		System.out.println("Infant is Wishing");
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("Infant is crying");
	}

	@Override
	public void laugh() {
		// TODO Auto-generated method stub
		
	}

}
