package com.techlab.test;

import com.techlab.model.FestivalType;

import com.techlab.model.FixedDeposit;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FixedDeposit fd = new FixedDeposit(1,"Name",500,1000,5,FestivalType.DIWALI);
		printfd(fd);
	}
	public static void printfd(FixedDeposit fd) {
		System.out.println(fd.calculateSimpleInterst());
	}

}
