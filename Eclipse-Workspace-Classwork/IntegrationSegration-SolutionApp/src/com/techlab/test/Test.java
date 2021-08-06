package com.techlab.test;

import com.techlab.model.IEatable;
import com.techlab.model.IWorkable;
import com.techlab.model.Managers;
import com.techlab.model.Robot;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Managers mang = new Managers();
		printWorkStatus(mang);
		printEatStatus(mang);
		Robot rob = new Robot();
		printWorkStatus(rob);
	}
	private static void printWorkStatus(IWorkable work) {
		work.startWork();
		work.stopWork();
	
	}
	private static void printEatStatus(IEatable eat) {
		eat.startEat();
		eat.stopEat();
	
	}

}
