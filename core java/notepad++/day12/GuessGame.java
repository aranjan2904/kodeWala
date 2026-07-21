package com.kodewala;
import java.util.Scanner;

class GuessGame
{		
	
	public static void main(String rgs[]){
        Scanner scanner = new Scanner(System.in);
		GuessGame game = new GuessGame();
		game.startGame();
		
	}
	
	void startGame(){
		int luckyNum = 15;
		int inputNum = 0;
		System.out.println("Guess the Lucky no...");
		while(luckyNum != inputNum){
			
			inputNum = scanner.nextInt();
			
			if(luckyNum == inputNum){
				System.out.println("You Won!!!");
			}else{
				System.out.println("You Loose!!! TRY AGAIN");
			}
		}
		
	}
}
