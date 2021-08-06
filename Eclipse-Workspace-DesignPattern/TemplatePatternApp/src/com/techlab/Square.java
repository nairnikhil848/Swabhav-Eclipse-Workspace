package com.techlab;

public class Square extends Shape{
	@Override
	void drawShape() {
		// TODO Auto-generated method stub
		System.out.println("New Square has been Drawn");
	}

	@Override
	void addVertices() {
		// TODO Auto-generated method stub
		System.out.println("Vertices of the Square  has been added");
	}

	@Override
	void deleteShape() {
		// TODO Auto-generated method stub
		System.out.println("Square has been Rubbed");
	}
}
