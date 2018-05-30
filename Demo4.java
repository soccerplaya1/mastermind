// String libraries.

class Demo4 {
	
	public static void main (String args[]) {
		String myFirstName = "Horatio";
		String mySecondName = " Wilson";
		String switchedName = "";
		
		myFirstName = myFirstName.concat(mySecondName); // Concatenates the specified string to the end of this string.
		System.out.println(myFirstName);
		
		switchedName = myFirstName.replace(myFirstName, "Wilson.Horatio"); // Returns a string resulting from replacing all occurrences of oldChar in this string with newChar.
		System.out.println(switchedName);
	}

}

//String replacedString = someString.replace("HelloBrother", "Brother");