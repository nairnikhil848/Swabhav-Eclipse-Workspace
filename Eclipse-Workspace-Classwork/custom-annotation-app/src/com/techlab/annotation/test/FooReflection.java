package com.techlab.annotation.test;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import com.techlab.annotation.Foo;
import com.techlab.annotation.NeedToBeRefactor;
import com.techlab.annotation.unitTestCase;

public class FooReflection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doReflection(Foo.class);
	}
	private static void doReflection(Class<Foo> class1) {
		// TODO Auto-generated method stub
		Method[] methods = class1.getMethods();
		List<Method> annotations = new ArrayList<Method>();
		for (Method method:methods) {
			if (method.isAnnotationPresent(unitTestCase.class)) {
				annotations.add(method);
			}
		}
		System.out.println("Found "+annotations.size()+ " unitTestCases");
		System.out.println("Passing Cases:\n");
		for(Method method:annotations) {
			
			try {
				if((boolean) method.invoke(new Foo())) {
						System.out.println(method.getName());
				}
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
		}
		System.out.println("Failing Cases:\n");
		for(Method method:annotations) {
			try {
				if(!(boolean) method.invoke(new Foo())) {
					System.out.println(method.getName());
}
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

		
	}

}
