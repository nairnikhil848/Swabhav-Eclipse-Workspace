package com.techlab.models;

import java.util.Set;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Account {

	@Id
	private String id;
	private String name;
	private String password;
	private double balance;

	@OneToMany(mappedBy = "acc", cascade = CascadeType.ALL)
	private Set<BankTransaction> transaction;

	public Account() {
		this.setId(UUID.randomUUID().toString());
	}

	public Account(String name, double balance, String password) {
		this.setId(UUID.randomUUID().toString());
		this.name = name;
		this.password = password;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
