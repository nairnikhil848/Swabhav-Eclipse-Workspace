package com.testlab.test;

import com.testlab.model.Person;

public class PersonTest {

	public static void main(String[] args) {

		Person person1 = new Person(10, "Nikhil", 6, 70);
		person1.play();
		printInfo(person1);
		person1.eat();
		printInfo(person1);
	}

	public static void printInfo(Person p) {
		System.out.println("Id-" + p.getId());
		System.out.println("Name-" + p.getName());
		System.out.println("Height-" + p.getHeight());
		System.out.println("Weight-" + p.getWeight());
		System.out.println("\n");
	}
}
