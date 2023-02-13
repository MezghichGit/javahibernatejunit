package day1;

import java.time.LocalDate;
import java.util.Scanner;

public class TestVoiture {

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
		
		System.out.println("Taper les informations de votre voiture : ");
		
		System.out.println("****");
		
		
		Scanner sc = new Scanner(System.in); // création d'un lecture du clavier
		
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
		/*
		System.out.println("Marque = "+marque);
		System.out.println("Modele = "+modele);
		System.out.println("DateImmat = "+dateImmat);
		System.out.println("VitesseMax = "+vitesseMax);*/
		
		Voiture v1 = new Voiture(marque,modele,vitesseMax,dateImmat);
		System.out.println(v1);

	}

}
