package com.techlab.model;

public class RealImage implements IImage{
	private String filename;
	
	public RealImage(String filename) {
		this.filename = filename;
		System.out.println("Loading the Image :" + this.filename);
	}

	@Override
	public void display() {
		System.out.println("Displaying the Image :" +this.filename);
	}
	
}
