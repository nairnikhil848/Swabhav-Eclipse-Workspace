package com.techlab.test;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "Nikhil");
		map.put(2, "Nothing");
		
		map.put(2, "Nair");
		
		for (Map.Entry<Integer,String> me : map.entrySet()) {
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }
		map.remove(2);
		for (Map.Entry<Integer,String> me : map.entrySet()) {
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }
		
	}

}
