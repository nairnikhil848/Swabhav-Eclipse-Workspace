package com.techlab.test;


import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import com.techlab.model.Analyzer;
import com.techlab.model.Designation;

import Writer.FileWriter;
import Writer.UrlWriter;

public class Main {

	public static void main(String[] args) throws MalformedURLException, IOException  {
	
		 UrlWriter writer= new UrlWriter(new URL("https://swabhav-tech.firebaseapp.com/emp.txt"));
		 Analyzer analyzer = new Analyzer(writer);
		
		System.out.println("Max Salaried Person: "+analyzer.getMaxSalariedPerson());
		System.out.println("No of Employees Based on Designation: "+analyzer.getNoOfEmployeeBasedOnDesignation(Designation.MANAGER));
		System.out.println("No of Employees Based on DepartmentId: "+analyzer.getNoOfEmployeeBasedOnDepartment(30));
		
		System.out.println();
		
		FileWriter writer1= new FileWriter(new File("dataFile.txt"));
		Analyzer analyzer1 = new Analyzer(writer1);
		
		System.out.println("Max Salaried Person: "+analyzer1.getMaxSalariedPerson());
		System.out.println("No of Employees Based on Designation: "+analyzer1.getNoOfEmployeeBasedOnDesignation(Designation.MANAGER));
		System.out.println("No of Employees Based on DepartmentId: "+analyzer1.getNoOfEmployeeBasedOnDepartment(30));


	}

}
