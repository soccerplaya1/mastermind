class Demo6{
    public static void main(String[] args) {    
        
		// Immutable => Old state of String can still be used
		String name = new String("Hello");
		String answer = name.substring(1, 3);
		name.substring(1, 3);
		System.out.println(name);
		System.out.println(answer);
		
		// Mutable => Old state of String is no longer available. 
		StringBuilder sb = new StringBuilder("Hello");
		sb.append("Bye");
		System.out.println(sb);
		
		// Array
		int[] numbers;
		numbers = new int[7]; // Defines length at 7
		
		
		// Arraylist needs a Wrappper
		boolean hallo = true;
		Boolean hallo2 = new Boolean(hallo);
		ArrayList 
		
		
    }
}

