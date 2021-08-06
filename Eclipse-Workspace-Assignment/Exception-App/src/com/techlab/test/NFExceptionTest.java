package com.techlab.test;

public class NFExceptionTest {
	public static void main(String[] args) {
		try {
			int i = Integer.parseInt("Nikhil");
		}
		catch(NumberFormatException e ) {
			System.out.println(e);
		}
		
		
	}
}
