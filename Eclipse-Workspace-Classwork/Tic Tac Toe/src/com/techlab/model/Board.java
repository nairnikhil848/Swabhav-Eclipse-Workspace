package com.techlab.model;

public class Board {

	private int size;
	public Status status;
	private String[][] board;
	protected final String X = "X";
	protected final String O = "O";
	private String turn = X;
	//int count;

	public Board(int size) {
		this.size = size;
		board = new String[this.size][this.size];
		status = Status.In_Progress;
		for(int i = 0; i < this.size; i++)
			for(int j = 0; j < this.size; j++)
            board[i][j] = " ";
	}
	public int BoardSize() {
		return size;
	}
	protected String[][] board() {
		return board;
	}
	public String getTurn() {
		return turn;
	}
	public void changeTurn() {
		if(this.turn.equals(this.X)) {
			this.turn = this.O;
		}
		else {
			this.turn = this.X;
		}
	}
	public boolean placeMarker(int x,int y,String turn) {
		if(x<0 || x >= this.BoardSize() || y<0 || y >= this.BoardSize() ) {
			return false;
		}
		else if(!this.board[x][y].equals(" ")){
			return false;
		}
		this.board[x][y] = turn;
		return true;
	
	}
}
	
