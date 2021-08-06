package services;

public class Cell {
	private Mark mark;

	public Cell() {
		this.mark = Mark.EMPTY;
	}

	public Mark getMark() {
		return mark;
	}

	public void setMark(Mark mark) throws CellAlreadyMarkedException {
		if (this.mark == Mark.EMPTY) {
			this.mark = mark;
			return;
		} 
		throw new CellAlreadyMarkedException("This cell is already marked");
		
	}
}