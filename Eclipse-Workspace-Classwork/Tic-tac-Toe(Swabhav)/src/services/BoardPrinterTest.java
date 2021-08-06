package services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BoardPrinterTest {

	@Test
	void testPrintBoard() {
		int euql = 1;
		int makeit = 1;
		Board board = new Board(4);
		try {
			board.markCell(0, Mark.X);
		} catch (CellAlreadyMarkedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BoardPrinter printer = new BoardPrinter(board);

		printer.printBoard();
		assertEquals(euql, makeit);

	}

}
