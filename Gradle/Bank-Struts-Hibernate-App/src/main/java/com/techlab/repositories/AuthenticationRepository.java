package com.techlab.repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlab.models.Account;

@Repository
public class AuthenticationRepository {

	@Autowired
	private SessionFactory factory;
	private Transaction transaction;
	private Session session;

	public Account searchUserWithName(String name) {
		session = factory.openSession();
		transaction = session.beginTransaction();
		String hql = "FROM Account WHERE name = :name";
		Query query = session.createQuery(hql).setParameter("name", name);
		Account account = (Account) query.uniqueResult();
		session.close();

		return account;
	}

}
