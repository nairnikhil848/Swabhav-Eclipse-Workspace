package com.techlab.test;

import com.techlab.model.Circle;

public class CircleTest {

	public static void main(String[] args) {
		Circle[] cirArr = new Circle[5];
		Circle maxCircle;
		cirArr[0]=new Circle(5,"yellow");
		cirArr[1]=new Circle(10,"red");
		cirArr[2]=new Circle(15,"blue");
		cirArr[3]=new Circle(50,"orange");
		cirArr[4]=new Circle(20,"green");
		maxCircle = cirArr[0].findBiggestCircle(cirArr);
		printInfo(maxCircle);

	}
	public static void printInfo(Circle circle) {
		System.out.println("Details of the Circle-");
		System.out.println("Radius:"+circle.getRadius());
		System.out.println("Color:"+circle.getColor());
		System.out.println("Area:"+circle.calculateArea());
		System.out.println("Circumference:"+circle.calculatePeri());
	}

}
