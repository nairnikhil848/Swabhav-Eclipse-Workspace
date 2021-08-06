package com.techlab.test;

import java.util.Scanner;

import com.techlab.model.Board;
import com.techlab.model.BoardPrinter;
import com.techlab.model.BoardStatus;
import com.techlab.model.Status;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("...Welcome to Tic Tac Toe Game!...");
		System.out.println("Please Input the Size of the Board");
		int n = scan.nextInt();
		Board board = new Board(n);
		BoardPrinter printer = new BoardPrinter(board);
		BoardStatus status = new BoardStatus(board);
		
		printer.printBoard();
		System.out.println("Note: The Input format should 2 integer which has space between them(2D array) ");
		System.out.println("--------------------------------------");
		System.out.println("So,Lets start our Game");
		while(board.status.equals(Status.In_Progress)) {
			System.out.println("\n");
			System.out.println(board.getTurn()+"'s turn.. Enter the Input");
			int x = scan.nextInt();
			int y = scan.nextInt();
			if(board.placeMarker(x,y,board.getTurn())) {
				status.checkStatus(x, y, board.getTurn());
				board.changeTurn();
				printer.printBoard();
			}
			else {
				System.out.println("Invalid input.. Re-enter a valid Input");
			}
		}
		if(board.status.equals(Status.Draw)) {
			System.out.println();
			System.out.println("It's a draw! Thanks for playing.");
		}
		else if(board.status.equals(Status.X_Won)){
			System.out.println();
			System.out.println(
	                "Congratulations! X have won! Thanks for playing.");
		}
		else {
			System.out.println();
			System.out.println(
	                "Congratulations! Y have won! Thanks for playing.");
		}
	}

}
