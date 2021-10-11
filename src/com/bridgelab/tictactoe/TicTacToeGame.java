package com.bridgelab.tictactoe;

import java.util.Scanner;

public class TicTacToeGame {
	
	//declare global array 
	static char board [] = new char [10];
	
	// declare global variable
	public static  char player=' ';
	public static  char computer = ' ';
	
	public static void main(String[] args) {
		//print welcome message
		System.out.println("****** Welcome To Tic Tac Toe Game ****** ");
		// calling method 
		creatBoard();
		choosePlayer();
	}
	
	//********** UC1 - Create Board ***************//
	
	// Create method create Board 
	public static void creatBoard() {
		
		//declare for loop for add value in array
		for ( int i = 0; i<board.length; i++ ) {
			
			// Store empty char in array
			board [i] =' ';	
		}
	}
	
	//********** UC2 - Choose Player ***************//
	
	public static void choosePlayer() {
		Scanner scanner = new Scanner(System.in);
			
		// message for user 
		System.out.print("Choose X Or O any one to play the game:  ");
			
		// take char from user
		char inputValue = scanner.next().charAt(0);
			
		// check the condition 
		if(inputValue == 'x') {
			// assign value to player variable 
			player = inputValue;
		}
		else if (inputValue == 'o') {
			// assign value to player variable
			computer = inputValue;
		}
		else {
			// print invalid message for user if user choose anything without X and O
			System.out.println(" Invalid input. plese inter X and O  any one..");
		}
	}
}

