package com.techlab.model;

import com.tehlab.thicknessenum.Thickness;

public class Rectangle {
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
	
//	public Rectangle(int pwidth,int pheight,Thickness pthickness) {
//		width = inputValidation(pwidth);
//		height = inputValidation(pheight);
//		thickness = pthickness.toString();
//	}
	



	public void setWidth(int pwidth) {
		width = inputValidation(pwidth);	
	}

	public void setHeight(int pheight) {
		height =inputValidation(pheight);
	}
	public void setThickness(String pthickness) {
		thickness = thicknessValidation(pthickness);
	}
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
