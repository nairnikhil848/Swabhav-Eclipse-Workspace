package com.techlab.test;

public class RuntimeExceptionTest {
	public static void main(String[] args) {
		System.out.println("Inside Main");
		function1();
		System.out.println("End of Main");
	}

	private static void function1() {
		// TODO Auto-generated method stub
		System.out.println("Inside Function1");
		function2();
	}

	private static void function2() {
		// TODO Auto-generated method stub
		System.out.println("Inside Function2");
		function3();
	}

	private static void function3() {
		// TODO Auto-generated method stub
		System.out.println("Inside Function3");
		throw new RuntimeException();
	}
	
}
