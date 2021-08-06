package com.techlab.test;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import com.techlab.model.CgpaCalculator;
import com.techlab.model.CsvGenerator;
import com.techlab.model.GreCalculator;
import com.techlab.model.ICalculator;
import com.techlab.model.Student;

public class Test {
	public static void main(String[] args) {
		Set<Student> studs = new HashSet<Student>();

		Student stud1 = new Student("Nikhil", 1, "HarishNagar", 200, 7);
		Student stud2 = new Student("Nikhil1", 2, "Harish", 300, 8);
		Student stud3 = new Student("Nikhil2", 3, "Nagar", 400, 10);
		Student stud4 = new Student("Nikhil3", 4, "Hanuman", 500, 5);
		Student stud5 = new Student("Nikhil5", 5, "Lexcity", 700, 5.6);

		studs.add(stud1);
		studs.add(stud2);
		studs.add(stud3);
		studs.add(stud4);
		studs.add(stud5);
		studs.add(new Student("Nikhil6", 6, "Dadar", 800, 6));
		studs.add(new Student("Nikhil7", 7, "Kalyan", 900, 9.9));
		studs.add(new Student("Nikhil8", 8, "Ambarnath", 1000, 8));
		studs.add(new Student("Nikhil9", 9, "Panvel", 1100, 5.2));
		studs.add(new Student("Nikhil10", 10, "Thane", 200, 7.3));

		studs.add(stud1);
		studs.add(stud2);
		studs.add(stud3);
		studs.add(stud4);
		studs.add(stud5);

		CsvGenerator generator = new CsvGenerator(studs);

		try {
			generator.generateCsv(new File("copyemp.csv"));
			System.out.println("CSV created Successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getLocalizedMessage());
		}
		System.out.println();

		ICalculator gre = new GreCalculator(studs);
		System.out.println("Max GreScore :" + gre.Max());
		System.out.println("Min GreScore :" + gre.Min());
		System.out.println("Avg GreScore :" + gre.Average());

		System.out.println();

		ICalculator cgpa = new CgpaCalculator(studs);
		System.out.println("Max CgpaScore :" + cgpa.Max());
		System.out.println("Min CgpaScore :" + cgpa.Min());
		System.out.println("Avg CgpaScore :" + cgpa.Average());

	}
}
