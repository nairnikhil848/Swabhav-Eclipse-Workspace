package com.techlab.test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetApp {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>();
		set.add("Nikhil");
		set.add("Nothing");
		
		System.out.println(set.contains("Nothing"));
		
		set.remove("Nikhil");
		for(String str : set) {
			System.out.println(str);
		}
	}

}
