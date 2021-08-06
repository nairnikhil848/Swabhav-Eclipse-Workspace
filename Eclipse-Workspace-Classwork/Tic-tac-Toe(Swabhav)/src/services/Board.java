package services;

import java.util.ArrayList;
import java.util.List;

public class Board {

	private List<Cell> boardList;
	private int size;

	public Board(int size) {
		this.size = size;
		boardList = new ArrayList<Cell>();
		for (int i = 0; i < this.size * this.size; i++) {
			boardList.add(new Cell());
		}
	}

	public int getSize() {
		return size;
	}

	public List<Cell> getBoard() {
		return boardList;
	}

	public void markCell(int pos, Mark mark) throws CellAlreadyMarkedException {
		boardList.get(pos).setMark(mark);
	}

	public void resetBoard() {
		boardList = new ArrayList<Cell>();
		for (int i = 0; i < this.size * this.size; i++) {
			boardList.add(new Cell());
		}
	}

	public boolean isBoardFull() {
		for (Cell cell : boardList) {
			if (cell.getMark() == Mark.EMPTY) {
				return false;
			}
		}
		return true;
	}
}
