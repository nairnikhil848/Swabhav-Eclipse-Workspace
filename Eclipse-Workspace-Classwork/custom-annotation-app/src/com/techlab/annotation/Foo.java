package com.techlab.annotation;

public class Foo {
	@unitTestCase
	public boolean method1() {
		return true;
	}
	@unitTestCase
	public boolean method2() {
		return false;
	}
	@unitTestCase
	public boolean method3() {
		return true;
	}
	public boolean method4() {
		return false;
	}

}
