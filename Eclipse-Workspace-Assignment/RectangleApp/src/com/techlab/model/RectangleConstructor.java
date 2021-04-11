package com.techlab.model;

import com.tehlab.thicknessenum.Thickness;

public class RectangleConstructor {
	private int width;
	private int height;
	private int min = 1;
	private int max = 100;
	private String thickness;
	
	private int inputValidation(int measurements) {
		if(measurements<0) {
			return min;
		}
		else {
			if(measurements>=max) {
				return max;
			}
			else {
				return measurements;
			}
		}
	}
	private String thicknessValidation(String pthickness) {
		if(pthickness.equals("high")) {
			return "high";
		}
		else{
			if(pthickness.equals("medium")) {
				return "medium";
			}
			else {
				return "low";
			}
		}
		
	}
	
	public RectangleConstructor(int width,int height,Thickness thickness) {
		this.width = inputValidation(width);
		this.height = inputValidation(height);
		this.thickness = thickness.toString();
	}
	public RectangleConstructor(int width,int height) {
		this(width,height,Thickness.LOW);
	}



//	public void setWidth(int pwidth) {
//		width = inputValidation(pwidth);	
//	}
//
//	public void setHeight(int pheight) {
//		height =inputValidation(pheight);
//	}
	public int calculateArea() {
		return width * height;
	}
	
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public String getThickness() {
		
		return thickness;
	}
}
