package services;

public class BoardPrinter {
	private Board board;

	public BoardPrinter(Board board) {
		this.board = board;
	}

	public void printBoard() {
		int k = 0;
		for (int i = 0; i < board.getSize(); i++) {
			for (int j = 0; j < board.getSize(); j++) {
				if (board.getBoard().get(k).getMark().equals(Mark.EMPTY)) {
					System.out.print("[" + "-" + "]");
				} else {
					System.out.print("[" + board.getBoard().get(k).getMark() + "]");
				}
				k++;
			}
			System.out.println();
		}
	}
}
