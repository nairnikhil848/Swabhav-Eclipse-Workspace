package com.techlab.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class CsvGenerator {

	private Set<Student> sets;

	public CsvGenerator(Set<Student> sets) {
		this.sets = sets;
	}

	public void generateCsv(File file) throws IOException {

		FileWriter writer = new FileWriter(file);

		writer.append("Name");
		writer.append(",");
		writer.append("Rollno");
		writer.append(",");
		writer.append("Location");
		writer.append(",");
		writer.append("GreScore");
		writer.append("\n");

		for (Student stud : sets) {
			writer.append(stud.getName());
			writer.append(",");
			writer.append(stud.getRollNo().toString());
			writer.append(",");
			writer.append(stud.getLocation());
			writer.append(",");
			writer.append(stud.getGreScore().toString());
			writer.append("\n");
		}

		writer.close();

	}
}
