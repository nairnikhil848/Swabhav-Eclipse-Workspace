package com.techlab.model;

public class Robot implements IWorkable{

	@Override
	public void startWork() {
		// TODO Auto-generated method stub
		System.out.println("Robot started Working..");
	}

	@Override
	public void stopWork() {
		// TODO Auto-generated method stub
		System.out.println("Robot stopped their work...");
	}

	@Override
	public void startEat() {
		// TODO Auto-generated method stub
		System.out.println("Robot started Eating..");
	}

	@Override
	public void stopEat() {
		// TODO Auto-generated method stub
		System.out.println("Robot stopped consuming his food");
	}

}
