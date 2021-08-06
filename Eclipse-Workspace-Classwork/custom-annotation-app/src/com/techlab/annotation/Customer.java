package com.techlab.annotation;

public class Customer {
	@NeedToBeRefactor
	public void m1() {
		System.out.println("I'm inside method 1...");
	}

	public void m2() {
		System.out.println("I'm inside method 2...");

	}

	public void m3() {
		System.out.println("I'm inside method 3...");

	}
	@NeedToBeRefactor
	public void m4() {
		System.out.println("I'm inside method 4...");

	}

}
