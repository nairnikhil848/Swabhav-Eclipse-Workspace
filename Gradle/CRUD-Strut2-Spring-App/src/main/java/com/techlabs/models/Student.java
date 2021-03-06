package com.techlabs.models;

import java.util.UUID;

public class Student {

	private String id = UUID.randomUUID().toString();
	private String name;
	private int rollno;
	private double cgpa;
	private String location;

	public Student(String name, int rollNo, double cgpa, String location) {
		this.id = UUID.randomUUID().toString();
		System.out.println("uuid = " + id);
		this.name = name;
		this.setRollno(rollNo);
		this.setCgpa(cgpa);
		this.location = location;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCgpa() {
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

	public void setLocation(String location) {
		this.location = location;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

}
