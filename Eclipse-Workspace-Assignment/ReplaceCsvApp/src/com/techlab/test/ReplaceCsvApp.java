package com.techlab.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReplaceCsvApp {
	 public static final String delimiter = ",";

	public static void main(String[] args) {
		try {
	         File sourcefile = new File("C:\\Users\\nairn\\OneDrive\\Desktop\\emp.csv");
	         FileReader fr = new FileReader(sourcefile);
	         File destfile = new File("C:\\Users\\nairn\\OneDrive\\Desktop\\copyemp.csv");
	         FileWriter myWriter = new FileWriter(destfile);
	         
	         BufferedReader br = new BufferedReader(fr);
	         String line = "";
	         String[] tempArr;
	         while((line = br.readLine()) != null) {
	            tempArr = line.split(delimiter);
	            for(String tempStr : tempArr) {
	            	System.out.print(tempStr + " ");
	            	if(tempStr.equals("KING")){
	            		myWriter.write("NIKHIL" + " ");
	            	}
	            	else {
	            		myWriter.write(tempStr + " ");
	            	}
	            }
	            myWriter.write("\n");
	            System.out.println();
	         }
	         br.close();
	         myWriter.close();     
	         sourcefile.delete();
	         destfile.renameTo(sourcefile);
	   
	         
	         
	         } catch(IOException ioe) {
	            ioe.printStackTrace();
	         }

	}

}
