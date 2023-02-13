package day1;

import java.time.LocalDate;

public class Application {

	public static void main(String[] args) {
		//System.out.println("Hello Java");
		
		// 1) Création d'une instance
		
		Animal a1 = new Animal(); // appel au contructeur par défaut
		
		Animal a2 = new Animal(); // appel au contructeur par défaut
		
		System.out.println(a1.nom);  //null
		System.out.println(a1.age);  // 0
        
		
		LocalDate naissance = LocalDate.of(2022, 7, 20);
		Animal a3 = new Animal("Rex", 1, naissance);
		a3.info();
		a1.info();
		
		//System.out.println("Nom : " + a3.nom);
		//System.out.println("Age : " + a3.age);
		//System.out.println("Date Naissance : " + a3.dateNaissance);
		
		System.out.println(Animal.AgeMax);
		
		//System.out.println(a1.AgeMax);
		//System.out.println(a2.AgeMax);
	}

}
