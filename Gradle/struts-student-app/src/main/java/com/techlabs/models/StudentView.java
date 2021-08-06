package com.techlabs.models;

import java.util.UUID;

public class StudentView {

	private String id;
	private String name;
	private int rollno;
	private double cgpa;
	private String location;

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
