package com.techlab.test;

import com.techlab.model.DogDoorAndWindows;
import com.techlab.model.Keypad;

public class DogDoorSimulator {

	public static void main(String[] args) {
		DogDoorAndWindows door = new DogDoorAndWindows();
		Keypad keypad = new Keypad(door,12345);
		System.out.println("Kristen enters her 4 digit code....:12345");
		keypad.matchCode(12345);
		try {
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) {
		}
		System.out.println("\nKristen enters her 4 digit code again....:12345");
		keypad.matchCode(12345);
	}

}
