// Using covariance in classes.

class Demo2{
	
	public static void main (String [] args) {
		Klaslokaal ks = new Klaslokaal();
		ks.student = new Student();
		ks.student.voornaam = "Piet";
		System.out.println(ks.student.voornaam);
		System.out.println();
		
		Vissenkom vk = new Vissenkom();
		Vis nemo = new Vis();
		Vis dory = new Vis();
		nemo.kleur = "oranje";
		
		//vk.vis.zwemmen();
		vk.vis = nemo;
		dory.kleur = "geel";
		// Switch to dory
		vk.vis = dory;
		vk.vis.zwemmen();
	
	}
}

class Klaslokaal{
	int hoogte;
	int breedte;
	int lengte;
	boolean projectorAanwezig;

	Student student;
}

class Student{
	String voornaam;
}

class Vissenkom{
	int diameter;
	Vis vis;
}

class Vis{
	String kleur;
	void zwemmen() {
		System.out.println("Ik ben aan het zwemmen en mijn kleur is: " + kleur);
	}
}