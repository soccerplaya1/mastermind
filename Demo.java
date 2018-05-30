class Demo{
	
	public static void main (String [] args) {
		int amountOfCoins = 2;
		
		Coffee coffee1 = new Coffee();
		Coffee coffee2 = new Coffee();
		
		//coffee1.colour = "Black";
		//coffee1.coffeeAmount = 330;
		
		coffee1.temperature = 50;
		coffee2.temperature = 60;
		System.out.println("Colour of each coffee: " + coffee1.colour);
		System.out.println("Amount of each coffee: " + coffee1.coffeeAmount + "ml");
		System.out.println("Coffee 1 temperature: " + coffee1.temperature + " degrees");
		System.out.println("Coffee 2 temperature: " + coffee2.temperature + " degrees");
		sellCoffee(amountOfCoins); // Name: argument = value
		
		if (coffee1.temperature == coffee2.temperature) {
			System.out.println("Coffee temperatures are equal");
		}
		else {
			System.out.println("Coffee temperatures are not equal");
		}
	}
	
	static void sellCoffee(int inhoud) { // Name: parameter = variable             // Signature = amount of parameters
		System.out.println();
		System.out.println(inhoud + " coins inserted.");
		if (inhoud < 2) {
			System.out.println("Not enough coins... Insert more.");
		}
		else {
			System.out.println("Coffee will be issued");
		}
	}
}

class Coffee {
	static String colour = "Black";		// Same for each instance
	static int coffeeAmount = 330;
	int temperature;      		// Non static variable because it is different for each instance.
	int amountOfSugarCubes;	
}