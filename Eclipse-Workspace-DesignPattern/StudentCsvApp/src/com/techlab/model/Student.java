package com.techlab.model;

public class Student {

	private String name;
	private Integer rollno;
	private String location;
	private Integer greScore;
	private double cgpa;

	public Student(String name, Integer rollno, String location, Integer greScore, double cgpa) {
		this.name = name;
		this.rollno = rollno;
		this.greScore = greScore;
		this.location = location;
		this.cgpa = cgpa;
	}

	public String getName() {
		return name;
	}

	public Integer getRollNo() {
		return rollno;
	}

	public Integer getGreScore() {
		return greScore;
	}

	public String getLocation() {
		return location;
	}

	public double getCgpa() {
		return cgpa;
	}

}
