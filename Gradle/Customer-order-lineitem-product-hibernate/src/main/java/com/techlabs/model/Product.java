package com.techlabs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Entity
public class Product {

	@Id
	private int id;
	private String name;

	@OneToOne
	@JoinColumn(name="Item_id")
	private LineItem lineItem;

	public Product() {

	}

	public Product(int id, String name) {
		this.setId(id);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LineItem getLineItem() {
		return lineItem;
	}

	public void setLineItem(LineItem lineItem) {
		this.lineItem = lineItem;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
