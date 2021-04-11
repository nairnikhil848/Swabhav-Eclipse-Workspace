package com.techlab.model;

public class Student {
	private int id;
	private String name;
	private int age;
	static String CollegeName;

	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;	
	}
	public Student(int id, String name) {
		this(id,name,25);
	}
	
	public int getId() {
		return id;

	}

	public String getName() {
		return name;

	}

	public int getAge() {
		return age;

	}

	public Student whoIsElder(Student s2) {
		if (this.age < s2.getAge()) {
			return s2;
		} else {
			return this;
		}

	}

}
