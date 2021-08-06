package com.techlab.model;

import java.util.Set;
import java.util.regex.Pattern;

import Writer.IWriter;

public class Analyzer {

	private Set<String> sets;

	public Analyzer(IWriter writer) {
		this.sets = writer.getSet();
	}

	public String getMaxSalariedPerson() {
		String name = null;
		int max = 0;

		for (String s : sets) {
			Pattern pattern = Pattern.compile(",");
			String[] words = pattern.split(s);
			if (Integer.parseInt(words[5]) > max) {
				max = Integer.parseInt(words[5]);
				name = words[1];
			}
		}

		return name;
	}

	public int getNoOfEmployeeBasedOnDepartment(int deptno) {
		int count = 0;
		for (String s : sets) {
			Pattern pattern = Pattern.compile(",");
			String[] words = pattern.split(s);
			if (Integer.parseInt(words[7]) == deptno) {
				count += 1;
			}
		}
		return count;

	}

	public int getNoOfEmployeeBasedOnDesignation(Designation des) {
		int count = 0;
		for (String s : sets) {
			Pattern pattern = Pattern.compile(",");
			String[] words = pattern.split(s);
			String str = words[2].replace("'", "");
			if (str.equals(des.toString())) {
				count += 1;
			}
		}
		return count;

	}

}
