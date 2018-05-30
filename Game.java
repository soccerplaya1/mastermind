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
		System.out.println("Choose a number between 0 and 9");
		System.out.println("Four correct numbers and you're a winner");
		System.out.println("You have 10 goes... Good luck!");
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		Player player1 = new Player();
		Computer computer = new Computer();
		
		int guessedNumber = Integer.parseInt(scanner.next());
		System.out.println(guessedNumber);
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
	// Checks if number from player is equal to number from Array.
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

