package day1;

public class Animal {
	// 1)Attributs d'instance (propriétés ou caractéristiques)
	String nom;
	int age;
	
	// 2)Les contructeurs
	
	public Animal()  // le constructeur par défaut(sans paramètres)
	{
		System.out.println("Construction d'un Animal");
	}
	
	public Animal(String nom, int age)
	{
		System.out.println("Construction d'un Animal avec deux paramèters");
		this.nom = nom;
		this.age = age;
	}

}
