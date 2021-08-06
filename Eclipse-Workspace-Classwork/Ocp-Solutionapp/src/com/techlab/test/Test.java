package com.techlab.test;

import com.techlab.model.DiwaliRate;
import com.techlab.model.FixedDeposit;
import com.techlab.model.iFestivalRate;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FixedDeposit fd = new FixedDeposit(1,"Name",500,1000,5,new DiwaliRate());
		printfd(fd);
	}
	public static void printfd(FixedDeposit fd) {
		System.out.println(fd.calculateSimpleInterst());
	}

}
