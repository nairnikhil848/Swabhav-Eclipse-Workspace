package com.techlab.model;

public class Circle {
	private int maxrad = 50;
	private int minrad = 10;
	private int radius = 10;
	private String color = "yellow";

	public Circle(int radius, String color) {
		if (radius <= maxrad && radius >= minrad) {
			this.radius = radius;
		}
		if (color.equals("red") || color.equals("green") || color.equals("blue")) {
			this.color = color;
		}
	}

	public int getRadius() {
		return radius;
	}

	public String getColor() {
		return color;
	}

	public float calculateArea() {
		return (float) (Math.PI * radius * radius);
	}

	public float calculatePeri() {
		return (float) (2 * Math.PI * radius);
	}

	public Circle findBiggestCircle(Circle[] cirArr) {
		Circle maxCircle = this;
		for (Circle circle : cirArr) {
			if (circle.radius > maxCircle.radius) {
				maxCircle = circle;
			}
		}
		
		return maxCircle;

	}
}
