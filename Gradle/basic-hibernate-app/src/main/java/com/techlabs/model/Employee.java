package com.techlabs.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Employee {

	@Id
	public String name;

	public Employee(String name) {
		this.name = name;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@ManyToOne
	@JoinColumn(name = "dept_deptno")
	private Department dept;
}
