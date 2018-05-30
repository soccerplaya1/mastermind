// Array declaration and store objects in it. 


// Object moet 2 fields en 1 methode hebben
// Maak een arraylist
// Gebruik 3 methoden uit de bibliotheek van arraylist
// Loop erover heen met de enhanced for loop
// Geef deze geef deze arraylist mee als argument naar 2 methoden

// Probeer ook een als return type

// Herhaal dit voor array (multidimensionaal)

import java.util.ArrayList;

class Demo8 {
    public static void main(String[] args) {    
        
		
		//Fiets fiets1 = new Fiets("White", 112);
		//Fiets fiets2 = new Fiets("Red", 113);
		//Fiets fiets3 = new Fiets("Black", 116);
		//Fiets fiets4 = new Fiets("White", 120);
		
		ArrayList<Fiets> myFietsenList = new ArrayList<Fiets>();
		myFietsenList.add(new Fiets("White", 112));
		myFietsenList.add(new Fiets("Red", 113));
		myFietsenList.add(new Fiets("Black", 116));
		myFietsenList.add(new Fiets("White", 120));
		
		for (Fiets element : myFietsenList) {
			element.repairBike();
			//System.out.println(fiets1.repairBike);
		}
		
    }
}

class Fiets {
	String bikeColour = "Red";
	int bikeNumber = 0;
	Fiets(String col, int num){
		this.bikeColour = col;
		this.bikeNumber = num;
	}
	void repairBike() {
		System.out.println("Fiets nummer "+ bikeNumber +" met kleur "+ bikeColour + " gerepareerd");
	}
	
}