package com.techlab.model;

public class InvoicePrinter {
	private Invoice Invoice;
	
	public InvoicePrinter(Invoice Invoice) {
		this.Invoice = Invoice;
	}
	public void printToConsole() {
		System.out.println("No: "+ Invoice.getId());
		System.out.println("Name: "+ Invoice.getName());
		System.out.println("Amount: "+ Invoice.getAmount());
		System.out.println("Discount Amount: "+ Invoice.calculateDiscount());
		System.out.println("Total Amount: "+ Invoice.calculateTotalCost());
	}
}
