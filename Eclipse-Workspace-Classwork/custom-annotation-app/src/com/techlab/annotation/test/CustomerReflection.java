package com.techlab.annotation.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Method;

import com.techlab.annotation.Customer;
import com.techlab.annotation.NeedToBeRefactor;

public class CustomerReflection {
	public static void main(String[] args) {
	doReflection(Customer.class);
		
	}

	private static void doReflection(Class<Customer> class1) {
		// TODO Auto-generated method stub
		System.out.println("Methods to be Refactored are\n"
						);
		Method[] methods = class1.getMethods();
		for (Method method:methods) {
			if (method.isAnnotationPresent(NeedToBeRefactor.class)) {
				
				System.out.println(method.getName());
			}
		}
		
		
		
//		Annotation[] annotations = class1.getAnnotations();
//
//		for(Annotation annotation : annotations){
//		    if(annotation instanceof NeedToBeRefactor){
//		    	NeedToBeRefactor myAnnotation = (NeedToBeRefactor) annotation;
//		        System.out.println("name: " + myAnnotation.hashCode());
//		        System.out.println("value: " + myAnnotation.toString());
//		    }
		
//		class1.get
//		AnnotatedType[] methods =  class1.getAnnotatedInterfaces();
//		for (AnnotatedType method:methods) {
//				System.out.println(method.get);
//		}
	}
	
}

