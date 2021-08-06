package com.techlab.model;

public class AgeValidationError extends Exception {
	StringBuilder str = new StringBuilder();
	String msg;

	public AgeValidationError(Person p, int age) {

		setMessage(p, age);
	}

	public void setMessage(Person p, int age) {
		str.append("Id-" + p.getId());
		str.append("\n");
		str.append("Name-" + p.getName());
		str.append("\n");
		str.append("Height-" + p.getHeight());
		str.append("\n");
		str.append("Weight-" + p.getWeight());
		str.append("\n");
		str.append("Your Age(" + age + ") is below 18");
		msg = str.toString();
	}

	@Override
	public String getMessage() {
		return msg;
	}
}
