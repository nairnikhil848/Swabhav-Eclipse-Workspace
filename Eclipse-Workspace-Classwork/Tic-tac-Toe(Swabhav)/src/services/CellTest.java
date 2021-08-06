package services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CellTest {

	@Test
	void test_set_mark() {
		// arrange
		Cell c = new Cell();
		Mark mark;
		Mark expectedMark;

		// act
		expectedMark = Mark.O;
		try {
			c.setMark(Mark.O);
		} catch (CellAlreadyMarkedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// assert
		assertEquals(expectedMark, c.getMark());
	}

	@Test
	void test_if_cell_is_empty() {

		// arrange
		Cell c = new Cell();
		Mark mark;
		Mark expectedMark;

		// act
		expectedMark = Mark.EMPTY;
		mark = c.getMark();

		// assert
		assertEquals(expectedMark, mark);

	}

	@Test
	void test_if_cell_is_O() {

		// arrange
		Cell c = new Cell();
		Mark mark;
		Mark expectedMark;

		// act
		expectedMark = Mark.O;
		try {
			c.setMark(Mark.O);
		} catch (CellAlreadyMarkedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		mark = c.getMark();

		// assert
		assertEquals(expectedMark, mark);

	}

	@Test
	void test_if_cell_is_X() {

		// arrange
		Cell c = new Cell();
		Mark mark;
		Mark expectedMark;

		// act
		expectedMark = Mark.X;
		try {
			c.setMark(Mark.X);
		} catch (CellAlreadyMarkedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		mark = c.getMark();

		// assert
		assertEquals(expectedMark, mark);

	}

	@Test
	void test_if_cell_is_alreadyMarked() {

		// arrange
		Cell c = new Cell();
		Mark mark;
		String expectedException = "This cell is already marked";
		String actualexception = "";

		// act
		try {
			c.setMark(Mark.O);
		} catch (CellAlreadyMarkedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			c.setMark(Mark.X);
		} catch (CellAlreadyMarkedException e) {
			// TODO Auto-generated catch block
			actualexception = e.getMessage();
		}
		// assert
		assertEquals(expectedException, actualexception);

	}

}
