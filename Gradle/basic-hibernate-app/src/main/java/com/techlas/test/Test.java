package com.techlas.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.techlabs.model.Customer;
import com.techlabs.model.Department;
import com.techlabs.model.Employee;
import com.techlabs.model.Orders;
import com.techlabs.model.Talent;

public class Test {
	public static void main(String[] args) {

		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");

		System.out.println(configuration);
		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();

		SessionFactory factory = configuration.buildSessionFactory(serviceRegistry);

		Session session = factory.openSession();

		System.out.println(session.getClass());
		Transaction txn = session.beginTransaction();

//		Talent t = new Talent(10,"Nikhil",6.7f);

//		Orders ord1 = new Orders(3,"Order3");
//		session.save(ord1);

		Customer cust = new Customer(1, "nikhil", "21");
		session.save(cust);
		txn.commit();
		session.close();

	}
}
