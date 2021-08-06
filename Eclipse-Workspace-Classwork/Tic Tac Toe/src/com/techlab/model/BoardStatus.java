package com.techlab.model;

public class BoardStatus {

	private Board board;
	
	public BoardStatus(Board board) {
		this.board = board;
	}
	public void checkStatus(int row,int col,String turn) {
		
		//column
		for(int i=0;i<board.BoardSize();i++) {
			if(!board.board()[i][col].equals(turn)) {
				break;
			}
			else if(i ==(board.BoardSize()-1)) {
				if(turn.equals(board.X)) {
					board.status = Status.X_Won;
					return;
				}
				else{
					board.status =  Status.O_Won;
					return;
				}
			}
		}
		//Row
		for(int j=0;j<board.BoardSize();j++) {
			if(!board.board()[row][j].equals(turn)) {
				break;
			}
			else if(j ==(board.BoardSize()-1)) {
				if(turn.equals(board.X)) {
					board.status = Status.X_Won;
					return;
				}
				else{
					board.status =  Status.O_Won;
					return;
				}
			}
		}
		
		//Diagonal
		if(row==col) {
			for(int i=0;i<board.BoardSize();i++) {
				if(!board.board()[i][i].equals(turn)) {
					break;
				}
				else if(i ==(board.BoardSize()-1)) {
					if(turn.equals(board.X)) {
						board.status = Status.X_Won;
						return;
					}
					else{
						board.status =  Status.O_Won;
						return;
					}
				}
			}
		}
		
		//AnitDiagonal
		
        if(row + col == board.BoardSize() - 1){
            for(int i = 0; i < board.BoardSize(); i++){
                if(!board.board()[i][(board.BoardSize()-1) - i].equals(turn))
                    break;
                if(i == board.BoardSize()-1){
                	if(turn.equals(board.X)) {
						board.status = Status.X_Won;
						return;
					}
					else{
						board.status =  Status.O_Won;
						return;
					}
                }
            }
        }
		//Check Draw
		for(int i = 0; i < board.BoardSize(); i++) {
			for(int j = 0; j < board.BoardSize(); j++) {
				if(board.board()[i][j].equals(" ")){
					board.status = Status.In_Progress;
					return;
				}
				else if(i==(board.BoardSize()-1) && j==(board.BoardSize()-1)) {
					board.status =  Status.Draw;
					return;
				}
			}
		}
		
	}
}
