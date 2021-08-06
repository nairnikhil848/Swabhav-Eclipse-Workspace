package com.techlab.model;

import java.util.Set;

public class CgpaCalculator implements ICalculator {
	private Set<Student> sets;

	public CgpaCalculator(Set<Student> sets) {
		this.sets = sets;
	}

	@Override
	public double Max() {
		// TODO Auto-generated method stub
		double max = 0;
		for (Student stud : sets) {
			if (stud.getCgpa() > max) {
				max = stud.getCgpa();
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
				min = stud.getCgpa();
			} else {
				if (stud.getCgpa() < min) {
					min = stud.getCgpa();
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
			sum += stud.getCgpa();

		}

		return sum / sets.size();
	}
}
