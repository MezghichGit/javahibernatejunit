package day1;

public class Animal {
	// 1)Attributs d'instance (propri�t�s ou caract�ristiques)
	String nom;
	int age;
	
	// 2)Attribut de classe : c'est une propri�t� li�e � la classe
	static int AgeMax = 150;
	
	
	// 3)Les contructeurs
	//Constructeur sans param�tres
	public Animal()  // le constructeur par d�faut(sans param�tres)
	{
		System.out.println("Construction d'un Animal");
	}
	//Constructeur avec param�tres
	public Animal(String nom, int age)
	{
		System.out.println("Construction d'un Animal avec deux param�ters");
		this.nom = nom;
		this.age = age;
	}

}
