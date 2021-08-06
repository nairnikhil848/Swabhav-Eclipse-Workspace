package com.techlab.model;

public class Square implements IShape{
	protected int height;
	protected int width;
	
	public Square(int side) {
		this.setHeight(side);
		this.setWidth(side);
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width  = width;
	}
	public int calculateArea() {
		return this.height*this.width;
	}
}
