package com.techlab.models;

import java.util.UUID;

public class Student {

	private String id;
	private String name;
	private int rollNo;
	private double cgpa;
	private String location;

	public Student(String name, int rollNo, double cgpa, String location) {
		this.id = UUID.randomUUID().toString();
		System.out.println("uuid = " + id);
		this.name = name;
		this.rollNo = rollNo;
		this.cgpa = cgpa;
		this.location = location;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getRollno() {
		return rollNo;
	}

	public double getCGPA() {
		return cgpa;
	}

	public String getLocation() {
		return location;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRollNo(int r) {
		this.rollNo = r;
	}

	public void setCGPA(double cgpa) {
		this.cgpa = cgpa;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
