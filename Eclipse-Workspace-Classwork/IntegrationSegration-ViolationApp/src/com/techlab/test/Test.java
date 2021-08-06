package com.techlab.test;

import com.techlab.model.IWorkable;
import com.techlab.model.Managers;
import com.techlab.model.Robot;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Managers mang = new Managers();
		printInfo(mang);
		Robot rob = new Robot();
		printInfo(rob);
	}
	private static void printInfo(IWorkable work) {
		work.startWork();
		work.stopWork();
		work.startEat();
		work.stopEat();
	}

}
