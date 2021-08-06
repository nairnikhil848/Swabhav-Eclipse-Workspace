package com.techlab.model;

public class Person {
	private int id;
	private String name;
	private float height;
	private float weight;
	private float age;

	public Person(int id, String name, float height, float weight, int age) throws AgeValidationError {
		this.id = id;
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = validate(age);
	}

	private float validate(int age) throws AgeValidationError {
		if (age < 18) {
			throw new AgeValidationError(this, age);
		}
		else {
			return age;
		}
	}

	public void eat() {
		weight = (weight * (105 / 100.0f));

	}

	public void play() {
		this.weight = (float) (90 / 100.0f) * this.weight;
		this.height = (float) (101 / 100.0f) * this.height;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public float getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}

}
