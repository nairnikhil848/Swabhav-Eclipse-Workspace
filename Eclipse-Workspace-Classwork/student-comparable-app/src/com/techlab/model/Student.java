package com.techlab.model;

import java.util.Comparator;

public class Student implements Comparable<Student>{
	private int id;
	private String name;
	private int age;
	private double cgpa;
	private String standard;
	
	public Student(int id,String name,double cgpa,int age, String standard) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.cgpa = cgpa;
		this.standard = standard;
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
	public double getcgpa() {
		return cgpa;
	}
	public String getStandard() {
		return standard;
	}
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append(this.id);
		str.append("\t");
		str.append(this.name);
		str.append("\t");
		str.append(this.age);
		str.append("\t");
		str.append(this.cgpa);
		str.append("\t");
		str.append(this.standard);
		str.append("\t");
		return str.toString();
	}
	
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if (this.cgpa == o.cgpa)
		      return 0;
		    else if (this.cgpa > o.cgpa)
		      return 1;
		    else
		      return -1;
	}
//	@Override
//	public int compare(Student o1, Student o2) {
//		// TODO Auto-generated method stub
//		return (int) (o1.cgpa - o2.cgpa);
//	}
	
	

}
