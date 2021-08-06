package com.techlab;

public class Triangle extends Shape{
	@Override
	void drawShape() {
		// TODO Auto-generated method stub
		System.out.println("New Triangle has been Drawn");
	}

	@Override
	void addVertices() {
		// TODO Auto-generated method stub
		System.out.println("Vertices of the Triangle has been added");
	}

	@Override
	void deleteShape() {
		// TODO Auto-generated method stub
		System.out.println("Triangle has been Rubbed");
	}
}
