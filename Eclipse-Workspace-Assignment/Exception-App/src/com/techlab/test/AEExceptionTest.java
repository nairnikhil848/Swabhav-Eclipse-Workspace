package com.techlab.test;

public class AEExceptionTest {
	public static void main(String[] args) {
		int a;
		try {
		a=50/0;
		}
		catch(ArithmeticException e){
			System.out.println(e);
			
		}
	}
}
