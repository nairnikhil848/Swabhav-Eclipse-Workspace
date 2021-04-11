package com.techlab.test;

import com.techlab.model.Bike;
import com.techlab.model.Car;
import com.techlab.model.IMovable;
import com.techlab.model.Truck;

public class MovableTest {


	public static void main(String[] args) {
		IMovable[] movs = new IMovable[3];
		movs[0] = new Bike();
		movs[1] = new Car();
		movs[2] = new Truck();
		startRace(movs);
	
	}

	private static void startRace(IMovable[] movable) {
		// TODO Auto-generated method stub
		for(IMovable mov:movable) {
			mov.move();
		}
		System.out.println("Race has Stopped");
	}
}
