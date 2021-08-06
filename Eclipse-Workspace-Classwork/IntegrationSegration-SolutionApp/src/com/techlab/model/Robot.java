package com.techlab.model;

public class Robot implements IWorkable {
	
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
}
