package com.techlab.test;

import com.techlab.model.DogDoor;
import com.techlab.model.Remote;

public class DogDoorSimulator {

	public static void main(String[] args) {
		DogDoor door = new DogDoor();
		Remote remote = new Remote(door);
		System.out.println("Bruce scratches at the dog door....");
		remote.pressButton();
		System.out.println("\nBruce goes outside....");
		System.out.println("\nBruce does his business..");
		try {
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) {
		}
		System.out.println("\nBruce scratches at the door again....");
		remote.pressButton();
		System.out.println("\nBruce comes back inside...");
	}

}
