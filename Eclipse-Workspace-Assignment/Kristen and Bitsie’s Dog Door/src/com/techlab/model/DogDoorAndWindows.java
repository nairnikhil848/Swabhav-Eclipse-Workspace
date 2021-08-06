package com.techlab.model;

public class DogDoorAndWindows {

	private boolean open;

	public DogDoorAndWindows() {
		this.open = true;
	}

	public void open() {
		System.out.println("The dog door and all the windows opens.");
		open = true;
	}

	public void close() {
		System.out.println("The dog door and all the windows closes.");
		open = false;
	}

	public boolean isOpen() {
		return open;
	}
}
