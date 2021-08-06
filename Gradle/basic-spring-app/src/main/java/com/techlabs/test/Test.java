package com.techlabs.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techlabs.services.StudentService;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println(context);
		
		StudentService svc1 = context.getBean("studentSvc",StudentService.class);
        System.out.println(svc1.get().size());

        StudentService svc2 = context.getBean("studentSvc",StudentService.class);
        System.out.println(svc2.get().size());
		
		
	}

}
