package com.techlab.model;

public class Student implements Comparable<Student>{
		private int id;
		private String name;
		private int age;
		private int minAge = 16;
		private int maxAge = 21;
		private int minId = 1;
		private int maxId = 50;
		private double cgpa;
		private String standard;
		
		public Student(int id,String name,double cgpa,int age, String standard) {
			this.id = validateId(id);
			this.name = name;
			this.age = validateAge(age);
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
		
		
		private int validateId(int id) {
			if(id < minId || id > maxId) {
				return 100;
			}
			else {
				return id;
			}
		}
		public void setId(int id) {
			this.id = validateId(id);
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		private int validateAge(int age) {
			if(age < minAge || age > maxAge) {
				return 16;
			}
			else {
				return age;
			}
		}
		public void setAge(int age) {
			this.age = validateAge(age);
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
			if(this.id ==o.id && this.standard.equals(o.standard))
			{
				return 0;
			}
			else {
			     return 1;
			}
		}

		@Override
		public int hashCode() {
		    return this.id;
		}
	    @Override
	    public boolean equals(Object obj) {
	    	Student obj1 = (Student)obj;
	    	return this.standard.equals(obj1.standard);	    	
	      }
		
		
}
