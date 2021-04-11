package com.techlab.test;

import com.techlab.model.Employee;
import com.techlab.model.Programmer;

public class Test {
	public static void main(String[] args) {
		Employee emp = new Employee(1,"Nikhil",2000);
		Programmer prog = new Programmer(2,"NotMe",5000,50);
		printEmp(emp);
		printProg(prog);
	}

	private static void printProg(Programmer prog) {
		// TODO Auto-generated method stub
		printEmp(prog);
		System.out.println("Bonus:"+prog.getBonus());
		
	}

	private static void printEmp(Employee emp) {
		// TODO Auto-generated method stub
		System.out.println("");
		System.out.println("Id:"+emp.getId());
		System.out.println("Name: "+emp.getName());
		System.out.println("Salary: "+emp.getSalary());
	}

	
	
	
}
