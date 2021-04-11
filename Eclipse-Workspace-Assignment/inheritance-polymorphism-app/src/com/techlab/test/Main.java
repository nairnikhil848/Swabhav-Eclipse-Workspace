package com.techlab.test;

import com.techlab.model.Boy;
import com.techlab.model.Infant;
import com.techlab.model.Kids;
import com.techlab.model.Man;

public class Main {
	public static void main(String[] args) {
		atThePark(new Boy());
		atThePark(new Kids()); 
		atThePark(new Infant());
		atThePark(new Man());
	}

	private static void atThePark(Man obj) {
		// TODO Auto-generated method stub
		obj.eat();
		obj.play();
	}

}
