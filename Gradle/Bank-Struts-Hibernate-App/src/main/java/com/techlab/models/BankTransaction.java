package com.techlab.models;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class BankTransaction {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private double amount;
	private char type;
	@Basic
	private Date date = new Date();

	public BankTransaction() {
	}

	public BankTransaction(Account acc, double amount, char type) {
		this.acc = acc;
		this.amount = amount;
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@PrePersist
	protected void onCreate() {
		setDate(new Date());
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public Account getAcc() {
		return acc;
	}

	public void setAcc(Account acc) {
		this.acc = acc;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@ManyToOne
	@JoinColumn(name = "acc_id")
	private Account acc;

}
