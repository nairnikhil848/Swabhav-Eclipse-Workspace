package com.techlab.test;

import com.techlab.model.Invoice;

public class Test {
	public static void main(String[] args) {
		Invoice in = new Invoice(1,"Nikhil",5000,10);
		in.printToConsole(in);
	}
}
