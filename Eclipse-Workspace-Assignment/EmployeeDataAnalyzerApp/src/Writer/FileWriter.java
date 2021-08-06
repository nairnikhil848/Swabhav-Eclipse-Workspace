package Writer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FileWriter implements IWriter {

	private Set<String> sets;

	public FileWriter(File path) {
		try {
			sets = new HashSet<String>();
			Scanner myReader = new Scanner(path);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				sets.add(data);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	@Override
	public Set<String> getSet() {
		// TODO Auto-generated method stub
		return sets;
	}

}
