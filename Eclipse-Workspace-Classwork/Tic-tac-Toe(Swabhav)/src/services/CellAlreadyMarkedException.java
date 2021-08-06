package services;

public class CellAlreadyMarkedException extends Exception {
	public CellAlreadyMarkedException(String s) {
		// Call constructor of parent Exception
		super(s);
	}
}
