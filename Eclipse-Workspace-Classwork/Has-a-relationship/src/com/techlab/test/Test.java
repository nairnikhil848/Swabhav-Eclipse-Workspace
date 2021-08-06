package com.techlab.test;

import business.domain.ClassA;
import dataccess.ClassB;

public class Test {
	
	public static void main(String[] args) {
		ClassA a = new ClassA(new ClassB());
		a.bar();
	}
}