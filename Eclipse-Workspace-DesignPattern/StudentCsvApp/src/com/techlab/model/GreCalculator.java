package com.techlab.model;

import java.util.Set;

public class GreCalculator implements ICalculator {

	private Set<Student> sets;

	public GreCalculator(Set<Student> sets) {
		this.sets = sets;
	}

	@Override
	public double Max() {
		// TODO Auto-generated method stub
		int max = 0;
		for (Student stud : sets) {
			if (stud.getGreScore() > max) {
				max = stud.getGreScore();
			}
		}
		return max;
	}

	@Override
	public double Min() {
		// TODO Auto-generated method stub
		double min = 0;
		for (Student stud : sets) {
			if (min == 0) {
				min = stud.getGreScore();
			} else {
				if (stud.getGreScore() < min) {
					min = stud.getGreScore();
				}
			}
		}
		return min;
	}

	@Override
	public double Average() {
		// TODO Auto-generated method stub
		double sum = 0;
		for (Student stud : sets) {
			sum += stud.getGreScore();

		}

		return sum / sets.size();
	}

}
