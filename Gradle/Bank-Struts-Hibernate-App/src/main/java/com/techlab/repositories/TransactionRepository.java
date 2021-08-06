package com.techlab.repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlab.models.Account;
import com.techlab.models.BankTransaction;

@Repository
public class TransactionRepository {
	@Autowired
	private SessionFactory factory;
	private Transaction transaction;
	private Session session;

	public boolean createTransaction(BankTransaction trans) {

		return true;
	}

	public List<BankTransaction> getTransactionsList(String id) {

		List<BankTransaction> list = new ArrayList<BankTransaction>();

		session = factory.openSession();
		transaction = session.beginTransaction();

		String hql = "FROM BankTransaction WHERE acc_id = :id ORDER BY date DESC";
		Query query = session.createQuery(hql).setParameter("id", id);

		list = (List<BankTransaction>) query.list();
		transaction.commit();
		session.close();
		return list;

//		select * from banktransactions WHERE id = \"" + id + "\" ORDER BY date DESC

	}

	public boolean isTransactionSuccessfull(BankTransaction trans) {

		session = factory.openSession();
		transaction = session.beginTransaction();

		Account acc = trans.getAcc();
		double balance = acc.getBalance() - trans.getAmount();
		if (trans.getType() == 'D') {
			balance = acc.getBalance() + trans.getAmount();
		}
		acc.setBalance(balance);
		session.update(acc);
		session.save(trans);

		transaction.commit();
		session.close();
		return true;

	}

}
