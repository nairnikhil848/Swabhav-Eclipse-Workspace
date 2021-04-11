package com.techlab.model;

public class Boy extends Man{
	@Override
	public void play() {
		System.out.println("boy is playing");
	}
	@Override
	public void eat() {
		System.out.println("boy is eating");
	}
}
