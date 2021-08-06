package com.techlab.model;

import java.util.Comparator;

public class Student {
	private int id;
	private String name;
	private int age;
	private double cgpa;
	private String standard;
	public Student(int id, String name, double cgpa, int age, String standard) {
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

    public static final Comparator<Student> NAME
    = new Comparator<Student>() {
     @Override
     public int compare(Student p1,Student p2) {
        int nameOrder = p1.getName().compareTo(p2.getName());
        if(nameOrder != 0) {
          return nameOrder;
        }
        return 0;
     }
   };

   public static final Comparator<Student> CGPA
    = new Comparator<Student>() {
	 @Override
     public int compare(Student p1, Student p2) {
		 if (p1.cgpa == p2.cgpa)
		      return 0;
		    else if (p1.cgpa > p2.cgpa)
		      return 1;
		    else
		      return -1;
     }
   };
   public static final Comparator<Student> ID
   = new Comparator<Student>() {
	 @Override
    public int compare(Student p1, Student p2) {
		 if (p1.id == p2.id)
		      return 0;
		    else if (p1.id > p2.id)
		      return 1;
		    else
		      return -1;
    }
  };

}
