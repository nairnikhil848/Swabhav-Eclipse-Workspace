package com.techlab.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreationTest {

	public static void main(String[] args) {
		try {
			FileWriter myWriter = new FileWriter("nikhil.txt");
			myWriter.write("Hello\t");
			myWriter.write("World");
			myWriter.close();
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

}
