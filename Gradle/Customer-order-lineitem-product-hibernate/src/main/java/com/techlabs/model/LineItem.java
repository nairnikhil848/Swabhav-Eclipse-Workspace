package com.techlabs.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class LineItem {
	@Id
	private int id;
	private int quantity;

	@OneToOne(cascade = CascadeType.ALL)
	private Product product;

	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order;

	public LineItem() {
	}

	public LineItem(int id, int qty) {
		this.setId(id);
		this.quantity = qty;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

}
