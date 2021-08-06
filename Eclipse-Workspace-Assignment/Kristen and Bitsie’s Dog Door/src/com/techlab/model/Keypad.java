package com.techlab.model;

public class Keypad {
	private int code;
	private DogDoorAndWindows door;
	
	public Keypad(DogDoorAndWindows door,int code) {
		this.code = code;
		this.door = door;
	}
	public void matchCode(int code) {
		if (code == this.code) {
			System.out.println("\nCode matched");
			if (door.isOpen()) {
				door.close();
			} else {
				door.open();
			}
		}
		else
			System.out.println("\nCode didn't matched");
	}
}
