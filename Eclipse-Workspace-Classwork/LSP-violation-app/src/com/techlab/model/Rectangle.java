package com.techlab.model;

public class Rectangle {
	protected int height;
	protected int width;
	
	public Rectangle(int height,int width) {
		this.setHeight(height);
		this.setWidth(width);
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
		this.width = width;
	}
	public int calculateArea() {
		return this.height*this.width;
	}
	
}
