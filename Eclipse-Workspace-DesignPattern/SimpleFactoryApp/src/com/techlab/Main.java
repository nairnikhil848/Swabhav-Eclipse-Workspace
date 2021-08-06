package com.techlab;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutomobileFactory factory = new AutomobileFactory();
		IAuto auto = factory.make(AutoType.AUDI);
		IAuto auto1 = factory.make(AutoType.AUDI);
		System.out.println(auto.hashCode());
		System.out.println(auto1.hashCode());
//		auto.start();
//		auto.stop();
//		auto.getName();
	}

}
