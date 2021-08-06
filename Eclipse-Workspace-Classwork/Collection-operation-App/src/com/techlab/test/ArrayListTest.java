package com.techlab.test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = new ArrayList<String>();
		ls.add("Nikhil");
		ls.add("Nothing");
		ls.set(1, "Nair");
		for(String str : ls) {
			System.out.println(str);
		}
		System.out.println("Specific element in index 0: "+ls.get(0));
		ls.remove("Nikhil");
		for(String str : ls) {
			System.out.println(str);
		}
	}

}
