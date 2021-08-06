package com.techlab.model;

public class ImageProxy implements IImage{
	
	private String filename;
	private RealImage realImage;
	public ImageProxy(String filename) {
		this.filename = filename;
	}
	@Override
	public void display() {
		if(this.realImage == null) {
			this.realImage = new RealImage(this.filename);
		}
		realImage.display();
		
	}
	
}
