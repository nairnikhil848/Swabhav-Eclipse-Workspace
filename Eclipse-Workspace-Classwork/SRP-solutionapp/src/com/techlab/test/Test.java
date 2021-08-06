package com.techlab.test;

import com.techlab.model.Invoice;
import com.techlab.model.InvoicePrinter;

public class Test {
	public static void main(String[] args) {
		Invoice in = new Invoice(1,"Nikhil",5000,10);
		InvoicePrinter invoiceprinter = new InvoicePrinter(in);
		invoiceprinter.printToConsole();
		
	}
}
