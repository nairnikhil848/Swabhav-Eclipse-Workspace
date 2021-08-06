package com.techlab.repositories;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlab.models.Account;
import com.techlab.models.BankTransaction;

@Repository
public class AccountRepository {

	@Autowired
	private SessionFactory factory;
	private Transaction transaction;
	private Session session;

	public boolean createAccount(Account acc) {
		boolean isAccountCreated = false;
		session = factory.openSession();
		transaction = session.beginTransaction();
		BankTransaction tran = new BankTransaction(acc, acc.getBalance(), 'D');
		session.save(acc);
		session.save(tran);
		transaction.commit();
		session.close();
		return true;
	}

	public double getBalance(String id) {
		Double balance = 0.0;

		session = factory.openSession();
		transaction = session.beginTransaction();
		String hql = "FROM Account WHERE id = :id";
		Query query = session.createQuery(hql).setParameter("id", id);
		Account account = (Account) query.uniqueResult();
		session.close();

		return account.getBalance();
	}

	public void updateAccount(Account acc) {
		session = factory.openSession();
		transaction = session.beginTransaction();
		session.saveOrUpdate(acc);
		transaction.commit();
		session.close();
	}

	public Account getAccount(String id) {
		session = factory.openSession();
		transaction = session.beginTransaction();
		String hql = "FROM Account WHERE id = :id";
		Query query = session.createQuery(hql).setParameter("id", id);
		Account account = (Account) query.uniqueResult();
		session.close();
		return account;
	}

}
