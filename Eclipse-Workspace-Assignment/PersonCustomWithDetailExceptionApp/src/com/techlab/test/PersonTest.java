package com.techlab.test;

import com.techlab.model.Person;

public class PersonTest {

	public static void main(String[] args) {
		try {
		Person person1 = new Person(10, "Nikhil", 6, 70,12);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
