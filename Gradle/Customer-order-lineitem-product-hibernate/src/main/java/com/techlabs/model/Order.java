package com.techlabs.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name = "Order")
@javax.persistence.Table(name = "orders")
public class Order {

	@Id
	private int id;

	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer cust;

	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
	private Set<LineItem> lineItems;

	public Order() {
	}

	public Order(int id) {
		this.setId(id);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Set<LineItem> getLineItems() {
		return lineItems;
	}

	public void setLineItems(Set<LineItem> lineItems) {
		this.lineItems = lineItems;
	}

	public Customer getCust() {
		return cust;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}

}
