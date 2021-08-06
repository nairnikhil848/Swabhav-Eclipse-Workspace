package com.techlab.model;

public class Managers implements IWorkable {

	@Override
	public void startWork() {
		// TODO Auto-generated method stubs
		System.out.println("Manager started Working....");
		
	}

	@Override
	public void stopWork() {
		// TODO Auto-generated method stub
		System.out.println("Manager stopped their Work...");
	}

	@Override
	public void startEat() {
		// TODO Auto-generated method stub
		System.out.println("Manager started Eating....");
	}

	@Override
	public void stopEat() {
		// TODO Auto-generated method stub
		System.out.println("Manager stopped consuming their meal..");
	}

}
