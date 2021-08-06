package presentation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import services.Board;
import services.BoardPrinter;
import services.CellAlreadyMarkedException;
import services.Game;
import services.Mark;
import services.Player;
import services.Result;
import services.ResultAnalyzer;

public class TicTacToeConsole {

	public TicTacToeConsole() {
		int pos;

		Scanner scan = new Scanner(System.in);
		List<Player> players = new ArrayList<Player>();

		System.out.println("...Welcome to Tic Tac Toe Game!...");

		System.out.println("Please Enter the size of the Board");
		int size = scan.nextInt();
		Board board = new Board(size);

		System.out.println("Enter the name of the player1 ");
		String p1 = scan.next();
		players.add(new Player(p1, Mark.X));

		System.out.println("Enter the name of the player2 ");
		String p2 = scan.next();
		players.add(new Player(p2, Mark.O));

		ResultAnalyzer analyzer = new ResultAnalyzer(board, players);
		Game game = new Game(board, analyzer, players);
		BoardPrinter printer = new BoardPrinter(board);
		Result result = analyzer.getResult();

		while (result == Result.In_Progress) {
			printer.printBoard();
			System.out.println(game.getCurrentPlayer().getName() + " - Enter the input in Cell (0-"
					+ (board.getSize() * board.getSize() - 1) + ")");
			pos = scan.nextInt();
			try {
				game.play(pos);
				result = analyzer.checkWinner();
			} catch (CellAlreadyMarkedException e) {
				System.out.println(e.getMessage());
			}
		}

		if (analyzer.getResult() == Result.Draw) {
			System.out.println();
			printer.printBoard();
			System.out.println("It's a draw! Thanks for playing.");
		} else {
			System.out.println();
			printer.printBoard();
			System.out.println("Congratulations!" + game.getCurrentPlayer().getName() + " have won! Thanks for playing.");
		}
	}
}
