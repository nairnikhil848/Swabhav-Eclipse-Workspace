package services;

import java.util.List;

public class ResultAnalyzer {

	private Board board;
	private String expectedStringForPlayer1 = "";
	private String expectedStringForPlayer2 = "";
	private Result result = Result.In_Progress;
	List<Player> players;

	public ResultAnalyzer(Board board, List<Player> players) {
		this.board = board;
		this.players = players;
		for (int i = 0; i < board.getSize(); i++) {
			expectedStringForPlayer1 += players.get(0).getMark();
			expectedStringForPlayer2 += players.get(1).getMark();
		}
	}

	public Result getResult() {
		return result;
	}
	
	
	
	
	public Result checkWinner() {

		// Row
		int pos = 0;
		for (int i = 0; i < board.getSize(); i++) {
			String actualString = "";
			for (int j = 0; j < board.getSize(); j++) {
				actualString += board.getBoard().get(pos).getMark();
				pos++;
			}
			if (actualString.equals(expectedStringForPlayer1)) {
				return Result.Won;
			} 
			if (actualString.equals(expectedStringForPlayer2)) {
				return Result.Won;
			}
		}

		// column
		for (int i = 0; i < board.getSize(); i++) {
			pos = i;
			String actualString = "";
			for (int j = 0; j < board.getSize(); j++) {
				actualString += board.getBoard().get(pos).getMark();
				pos += board.getSize();
			}
			if (actualString.equals(expectedStringForPlayer1)) {
				return Result.Won;
			}
			if (actualString.equals(expectedStringForPlayer2)) {
				return Result.Won;
			}		
		}
		
		// Diagonal
		pos = 0;
		String actualString = "";
		for (int j = 0; j < board.getSize(); j++) {
			actualString += board.getBoard().get(pos).getMark();
			pos += board.getSize() + 1;
		}
		if (actualString.equals(expectedStringForPlayer1)) {
			return Result.Won;
		} 
		if (actualString.equals(expectedStringForPlayer2)) {
			return Result.Won;
		}

		// AnitDiagonal
		pos = board.getSize() - 1;
		actualString = "";
		for (int j = 0; j < board.getSize(); j++) {
			actualString += board.getBoard().get(pos).getMark();
			pos += board.getSize() - 1;
		}
		if (actualString.equals(expectedStringForPlayer1)) {
			return Result.Won;
		} 
		if (actualString.equals(expectedStringForPlayer2)) {
			return Result.Won;
		}

		// Check if full
		if (board.isBoardFull()) {
			return Result.Draw;
		}

		return Result.In_Progress;

	}

}
