package services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BoardTest {

	@Test
	void test_board_size() {
		int expectedsize = 16;
		int actualsize;

		// act
		Board board = new Board(4);

		actualsize = board.getBoard().size();

		assertEquals(actualsize, expectedsize);
	}

	@Test
	void test_for_markCell() throws CellAlreadyMarkedException {

		Mark expectedmark = Mark.O;
		Mark actualmark;

		// act
		Board board = new Board(4);
		board.markCell(4, Mark.O);
		actualmark = board.getBoard().get(4).getMark();

		// assert
		assertEquals(expectedmark, actualmark);

	}

	@Test
	void test_for_markCell_Exception() {

		String expectedException = "This cell is already marked";
		String actualexception = "";
		// act
		Board board = new Board(4);
		try {
			board.markCell(4, Mark.O);
		} catch (CellAlreadyMarkedException e1) {
			// TODO Auto-generated catch block
			actualexception = e1.getMessage();
		}
		// again
		try {
			board.markCell(4, Mark.X);
		} catch (CellAlreadyMarkedException e) {
			// TODO Auto-generated catch block
			actualexception = e.getMessage();
		}

		// assert
		assertEquals(expectedException, actualexception);

	}

	@Test
	void test_if__Board_Full() {
		// arrange
		Board board = new Board(4);
		Boolean expectedresult = true;
		Boolean actualresult;

		// act
		for (int i = 0; i < board.getBoard().size(); i++) {
			try {
				board.markCell(i, Mark.O);
			} catch (CellAlreadyMarkedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		actualresult = board.isBoardFull();

		// assert
		assertEquals(expectedresult, actualresult);

	}

	@Test
	void test_if__Board_NotFull() {
		// arrange
		Board board = new Board(4);
		Boolean expectedresult = false;
		Boolean actualresult;

		// act
		for (int i = 0; i < board.getBoard().size() - 1; i++) {
			try {
				board.markCell(i, Mark.O);
			} catch (CellAlreadyMarkedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		actualresult = board.isBoardFull();

		// assert
		assertEquals(expectedresult, actualresult);

	}

}
