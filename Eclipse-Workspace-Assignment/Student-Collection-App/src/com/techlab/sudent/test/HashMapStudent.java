package com.techlab.sudent.test;

import java.util.HashMap;
import java.util.Map;

import com.techlab.model.Student;

public class HashMapStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Student,Student> stud = new HashMap<Student,Student>();
		stud.put(new Student(1,"Nikhil",7.5,21,"a"),new Student( 1,"Sarang",7.5,21,"a"));
		stud.put(new Student(1,"Nikhil",7.5,21,"a"),new Student( 1,"Sahil",7.5,21,"a"));
	
		for (Map.Entry<Student,Student> me : stud.entrySet()) {
	        System.out.print(me.getKey() + ":");
	        System.out.println(me.getValue());
	    }
	
	}
	
	
}
