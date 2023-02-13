package day1;

import java.time.LocalDate;

public class TestVoiture {

	public static void main(String[] args) {
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

	}

}
