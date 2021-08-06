package com.techlab.model;

public class TXTLogger implements ILogger {
	public void log(String ErrorMessage) {
		
		System.out.println("Writing data into TXT:..\n"+ ErrorMessage);
	}
}
