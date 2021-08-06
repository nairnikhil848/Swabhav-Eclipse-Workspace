package com.techlab.test;

import com.techlab.model.BasicCar;
import com.techlab.model.ICar;
import com.techlab.model.wrappers.LuxuryCar;
import com.techlab.model.wrappers.SportsCar;

public class Main {
	public static void main(String[] args) {
		ICar sportsCar = new SportsCar(new BasicCar());
		sportsCar.assemble();
		System.out.println("\n");
		
		ICar sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
		sportsLuxuryCar.assemble();
	}
}
