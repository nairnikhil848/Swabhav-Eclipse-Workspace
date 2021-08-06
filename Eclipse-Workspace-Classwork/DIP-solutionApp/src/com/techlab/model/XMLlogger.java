package com.techlab.model;

public class XMLlogger implements ILogger{
	public void log(String ErrorMessage) {
		System.out.println("Writing data into XML:..\n"+ ErrorMessage);
	}
}
