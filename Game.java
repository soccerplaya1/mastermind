// Mastermind

// New game screen prompted.
// Computer generates 4 random numbers.
// Computer stores these 4 values in an array.
// Player has can guess one number at a time.
// If number is correct the computer communicates this.
// Player has maximum of 10 guesses.
// When player is out of guesses or numbers have been guessed the game is over.
// New game screen will be prompted. 

import java.util.Random;
import java.util.Scanner;

class Game {
	public static void main(String[] args) {
		// Game and flow control
		System.out.println("Welcome to Mastermind -- Guess the numbers");
		
		boolean gameOn = true;
		while(gameOn){
			System.out.println("Choose a number between 0 and 9");
			System.out.println("Four correct numbers and you're a winner");
			System.out.println("You have 10 goes... Good luck!");
			System.out.println("Enter 'start' to start game, press q to exit");
			
			
			Scanner scanner = new Scanner(System.in);
			Player player1 = new Player();
			Computer computer = new Computer();
			computer.giveNumbers();
			String input = scanner.next();
			if(input.equals("q")){
				break;
				
				
			} else {
				
				if(player1.guessCounter<11){
					
					System.out.println("Enter a number");
					int guessedNumber = Integer.parseInt(scanner.next());
					System.out.println(guessedNumber);} 
				
				else {
					
					//return to main menu 
				}
				
				
				
			}
			
		}
		
	}
	
}

class Player {
	// Keeps track off goes and stores correct results.
	int guessCounter;
	
	void guessed (int Number) {
		guessCounter = Number;
			
	}
}

class Computer {
	
	int[] secretNumbers;
	
	Computer(){
		Random random = new Random();
		this.secretNumbers= new int[]{random.nextInt(10),random.nextInt(10),random.nextInt(10),random.nextInt(10)};
	}
	void giveNumbers(){
		{
			for(int i=0;i<4;i++){
				System.out.println(this.secretNumbers[i]);
			}
			
		}
		
	}
}

//static String toonMenu() {
	//System.out.println("Voer uw input in: a voor random of q voor quit");
	//Scanner scanner = new Scanner(System.in);
	//return scanner.next();
//}

//static void ietsRandom() {
	//Random random = new Random();
	//int uitkomst = random.nextInt(6);
	//System.out.println(uitkomst);
//}

