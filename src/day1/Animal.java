package day1;

public class Animal {
	// 1)Attributs d'instance (propriétés ou caractéristiques)
	String nom;
	int age;
	
	// 2)Attribut de classe : c'est une propriété liée à la classe
	static int AgeMax = 150;
	
	
	// 3)Les contructeurs
	//Constructeur sans paramètres
	public Animal()  // le constructeur par défaut(sans paramètres)
	{
		System.out.println("Construction d'un Animal");
	}
	//Constructeur avec paramètres
	public Animal(String nom, int age)
	{
		System.out.println("Construction d'un Animal avec deux paramèters");
		this.nom = nom;
		this.age = age;
	}

}
