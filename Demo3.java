//Passing objects as arguments to a method.

class Demo3 {
	public static void main (String [] args) {
		Persoon persoon1 = new Persoon();
		Persoon persoon2 = new Persoon();
		Bank bank = new Bank();
		persoon1.name = "Harry";
		persoon2.name = "Peter";
		persoon1.amountMoney = 500;
		persoon2.amountMoney = 300;
		System.out.println(persoon1.amountMoney);
		System.out.println(persoon2.amountMoney);
		bank.overschrijven(persoon1, persoon2, 50);
		System.out.println(persoon1.amountMoney);
		System.out.println(persoon2.amountMoney);
	}

}

class Bank {
	void overschrijven(Persoon persoon1, Persoon persoon2, int amount) {
		persoon1.amountMoney += amount;
		persoon2.amountMoney -= amount;
	}
}

class Persoon {
	String name;
	int amountMoney;	
}
