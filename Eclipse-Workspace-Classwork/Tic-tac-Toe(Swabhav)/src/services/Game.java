package services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

	private ResultAnalyzer analyzer;
	private List<Player> players;
	private Player currentPlayer;
	private Board board;
	private BoardPrinter printer;
	private int playCount;
	Scanner scan = new Scanner(System.in);

	public Game(Board board, ResultAnalyzer analyzer, List<Player> players) {
		this.board = board;
		this.analyzer = analyzer;
		this.players = players;
		this.printer = new BoardPrinter(board);

		playCount = 0;
		currentPlayer = players.get(0);

	}

	public Player getCurrentPlayer() {
		return currentPlayer;
	}

	private void changeTurn() {
		if (currentPlayer.equals(players.get(0))) {
			currentPlayer = players.get(1);
			return;
		}
			
		currentPlayer = players.get(0);
	}

	public void play(int pos) throws CellAlreadyMarkedException {

		board.markCell(pos, currentPlayer.getMark());
		playCount++;
		Result result = analyzer.getResult();
		if (playCount > board.getSize()) {
			result = analyzer.checkWinner();
		}
		if (result == Result.In_Progress)
			changeTurn();
	}
}
