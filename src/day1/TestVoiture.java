package day1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class TestVoiture {
	
	public static Voiture saisiDataVoiture(Scanner sc)
	{
		System.out.println("Taper la marque : ");
		String marque = sc.nextLine(); // nextLine() : méthode pour lire une chaine de caractère
		
		//System.out.println("Marque = "+marque);
		
		System.out.println("Taper le modèle : ");
		String modele = sc.nextLine();
		
		System.out.println("Taper la date immatriculation sous la forme : 2010-10-1");
		String dateImmatriculation = sc.nextLine();
		LocalDate dateImmat = LocalDate.parse(dateImmatriculation);
		
		System.out.println("Taper vitesse max : ");
		int vitesseMax = sc.nextInt();
		
		
		return new Voiture(marque,modele,vitesseMax,dateImmat);
	}

	public static void main(String[] args) {
		/*
		//nbreVoiture = 0
		Voiture.getNbreVoitures();
		Voiture v1 = new Voiture("BMW","Z3",280,LocalDate.of(2015, 10, 1));
		//nbreVoiture = 1
		//System.out.println(v1.toString());
		Voiture.getNbreVoitures();
		System.out.println(v1);
		
		Voiture v2 = new Voiture("Peugeot","Sport",320,LocalDate.of(2014, 11, 2));
		System.out.println(v2);
		//nbreVoiture = 2
		Voiture v3 = new Voiture("Mercedes","GLA180",240,LocalDate.of(2022, 01, 01));
		//nbreVoiture = 3
		System.out.println(v3);
		
		Voiture.getNbreVoitures(); // appel à la  méthode de classe
		
		*/
		
		Scanner sc = new Scanner(System.in); // création d'un lecture du clavier
		
		Voiture v1 = saisiDataVoiture(sc) ;
		System.out.println(v1);
		sc.nextLine();
		Voiture v2 = saisiDataVoiture(sc) ;
		System.out.println(v2);
		
		ArrayList<Voiture> voitures = new ArrayList<>();
		voitures.add(v1);
		voitures.add(v2);
		
		System.out.println("Contenu de la liste voitures : ");
		System.out.println(voitures);

	}

}
