package com.bridgelab.tictactoe;

public class TicTacToeGame {
	
	//declare global array 
	static char board [] = new char [10];	
	
	public static void main(String[] args) {
		//print welcome message
		System.out.println("Welcome To Tic Tac Toe Game.. ");
		// calling method creat board
		creatBoard();
	}
	
	//********** UC1 - Create Board ***************
	
	// Create method creat Board 
	public static void creatBoard() {
		
		//declare for loop for add value in array
		for ( int i = 1; i<board.length; i++ ) {
			
			// Store empty char in array
			board [i] =' ';	
		}			
	}

}
