package com.techlab.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreationApp {
	public static void main(String[] args) {
		 try {
		      File myObj = new File("nikhil.txt");
		      myObj.createNewFile();
		      FileWriter myWriter = new FileWriter("nikhil.txt");
		      myWriter.write("Hello\t");
		      myWriter.write("World");
		      
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
}
