package com.techlab.model;

public class BoardPrinter {
	
	private Board board;
	
	public BoardPrinter(Board board) {
		this.board = board;
	}
	public void printBoard() {
		for(int i = 0; i < board.BoardSize(); i++) {
			for(int j = 0; j < board.BoardSize(); j++) {
				System.out.print("["+ board.board()[i][j] + "]");
			}
			System.out.println();
		}
	}
}
