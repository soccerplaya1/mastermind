// Array declaration and store objects in it. 

class Demo7 {
    public static void main(String[] args) {    
        
		String p0 = "Pepperoni";
		String p1 = "Ham";
		String p2 = "Ham and pineapple";
		String p3 = "Pepperoni";
		
		Pizza pizza1 = new Pizza(p0);
		Pizza pizza2 = new Pizza(p1);
		Pizza pizza3 = new Pizza(p2);
		Pizza pizza4 = new Pizza(p3);
		
		Pizza pizza[] = new Pizza[4];
		
		pizza[0] = pizza1;
		pizza[1] = pizza2;
		pizza[2] = pizza3;
		pizza[3] = pizza4; 
		
		for (int i = 0; i < pizza.length; i++) {
			System.out.println(pizza[i].ingredients); 
		}
			
		
    }
}

class Pizza {
	String ingredients;
	Pizza(String in) {
		this.ingredients = in;	
	}
}