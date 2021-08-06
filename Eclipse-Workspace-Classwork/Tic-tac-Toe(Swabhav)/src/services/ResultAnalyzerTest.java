package services;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class ResultAnalyzerTest {

	@Test
	void testResultAnalyzer() {
		fail("Not yet implemented");
	}

	@Test
	void testWinner() {
		Board board = new Board(3);
		try {
			board.markCell(0, Mark.X);
			board.markCell(2, Mark.X);
			board.markCell(5, Mark.X);
			board.markCell(8, Mark.X);
		} catch (CellAlreadyMarkedException e) {
			
			e.printStackTrace();
		}
		List<Player> players = new ArrayList<Player>();
		players.add(new Player("p1", Mark.X));
		players.add(new Player("p2", Mark.O));

		ResultAnalyzer analyzer = new ResultAnalyzer(board, players);
		BoardPrinter printer = new BoardPrinter(board);
		printer.printBoard();
		System.out.println(analyzer.checkWinner());
		
		//diagonal
		Board board1 = new Board(4);
		try {
			board1.markCell(0, Mark.X);
			board1.markCell(5, Mark.X);
			board1.markCell(10, Mark.X);
			board1.markCell(15, Mark.X);
		} catch (CellAlreadyMarkedException e) {
			
			e.printStackTrace();
		}
		

		ResultAnalyzer analyzer1 = new ResultAnalyzer(board1, players);
		BoardPrinter printer1 = new BoardPrinter(board1);
		printer1.printBoard();
		System.out.println(analyzer1.checkWinner());

	}

}
