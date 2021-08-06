package com.techlab.reflection;

import java.lang.reflect.Method;

import com.techlab.model.Rectangle;

public class ReflectionTest {
	public static void main(String[] args) {
		doReflection(Object.class);
		doReflection(String.class);
		doReflection(Rectangle.class);
	}

	private static void doReflection(Class class1) {
		// TODO Auto-generated method stub
		Class cls = class1.getClass();
		System.out.println("\tThe name of class is " + cls.getName()+"\n");
		Method[] methods = class1.getMethods();
		System.out.println("No of Methods are:"+methods.length);
		System.out.println("\nSetters:");
		for (Method method:methods) {
			if (method.getName().startsWith("set")) {
				System.out.println(method.getName());
			}
		}
		System.out.println("\nGetters:");
		for (Method method:methods) {
			if (method.getName().startsWith("get") ||
	                   method.getName().startsWith("is"))  {
				System.out.println(method.getName());
			}
		}

	}
}

