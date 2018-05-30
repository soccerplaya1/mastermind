class Kip{
	
	public static void main (String [] dodo) 
	{
		// Instantiate object and assign info to fields
		Kip kfc = new Kip();
		kfc.colour = "White";
		kfc.lifeStatus = true;
		kfc.pawNumbers = 2;
		
		Kip bertha = new Kip();
		bertha.colour = "Red";
		bertha.lifeStatus = false;
		bertha.pawNumbers = 1;
		
		// Kfc print field info to screen
		System.out.println("Colour: " + kfc.colour);
		System.out.println("Alive: " + kfc.lifeStatus);
		System.out.println("Number of paws: " + kfc.pawNumbers);
		
		// Bertha print field info to screen
		System.out.println("Colour: " + bertha.colour);
		System.out.println("Alive: " + bertha.lifeStatus);
		System.out.println("Number of paws: " + bertha.pawNumbers);
		
		// Call method
		kfc.layEggs(10);
	}
	
	// Fields
	String colour = "White";
	boolean lifeStatus = true;
	byte pawNumbers = 2;
	
	// Methods
	static void layEggs(int amountOffEggs) {
		System.out.println("Amount of eggs: " + amountOffEggs);
	}
}