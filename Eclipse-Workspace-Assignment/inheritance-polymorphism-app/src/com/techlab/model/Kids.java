package com.techlab.model;

public class Kids extends Man{
	@Override
	public void play() {
		System.out.println("Kids are playing");
	}
	@Override
	public void eat() {
		System.out.println("Kids are eating");
	}
}
