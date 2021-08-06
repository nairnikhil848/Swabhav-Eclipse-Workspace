package com.techlab.sudent.test;

import java.util.HashMap;
import java.util.Map;

import com.techlab.model.Student;

public class MapStudentTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Student> map = new HashMap<Integer,Student>();
		map.put(1,new Student(1,"Nikhil",7.5,21,"a"));
		map.put(2,new Student(2,"Parth",7.7,23,"a"));
		map.put(3,new Student(3,"Harish",7.8,24,"a"));
		for (Map.Entry<Integer,Student> me : map.entrySet()) {
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }
		map.remove(2);
		System.out.println("\n");
		for (Map.Entry<Integer,Student> me : map.entrySet()) {
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }
		
	}
	
}
