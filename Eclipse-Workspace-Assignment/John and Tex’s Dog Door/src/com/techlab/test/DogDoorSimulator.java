package com.techlab.test;

import com.techlab.model.DogDoor;
import com.techlab.model.Remote;

public class DogDoorSimulator {
	public static void main(String[] args) {
		DogDoor door = new DogDoor();
		Remote remote = new Remote(door);
		
		remote.pressButton();
		System.out.println("\nTex goes outside...");
		System.out.println("\nTex does his business...");
		try {
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) { }
		System.out.println("\n...Tex get muddy!");
		System.out.println("John cleans tex up...");
		System.out.println("\nJohn presses a button...");
		remote.pressButton();
		System.out.println("\nTex’s back inside...");
	}
}	
