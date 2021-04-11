package com.student.model;

public class Student {
		private int id;
		private String name;
		private int age;
		private int minAge = 16;
		private int maxAge = 21;
		private int minId = 1;
		private int maxId = 50;
		
		public int getId() {
			return id;
		}
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
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
		
}
