package com.techlab.model;

public class JSONLogger implements ILogger{
	public void log(String ErrorMessage) {
		System.out.println("Writing data into JSON:..\n"+ ErrorMessage);
	}
}	
