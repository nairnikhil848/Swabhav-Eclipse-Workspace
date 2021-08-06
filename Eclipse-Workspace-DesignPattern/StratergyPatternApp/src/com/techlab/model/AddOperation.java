package com.techlab.model;

public class AddOperation implements IStrategy{
	   
	@Override
	   public int doOperation(int num1, int num2) {
	      return num1 + num2;
	   }
}
