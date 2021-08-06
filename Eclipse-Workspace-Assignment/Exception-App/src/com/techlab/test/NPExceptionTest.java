package com.techlab.test;

public class NPExceptionTest {
	public static void main(String[] args) {
		String s=null;
		try {
		System.out.println(s.length());
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
	}
}
