package lesException;

import java.util.Scanner;

public class Exo_Exception {

	public static void main(String[] args) {
		int x, y;
		double result=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Taper x");
		x= sc.nextInt();
		
		System.out.println("Taper y");
		y= sc.nextInt();
		
		try {
			result = x/y;
		}
		catch(ArithmeticException ex)
		{
			System.out.println(ex.getMessage());
		}
		
		finally{
			if(y !=0)
			{
				System.out.println("Le résultat est = "+result);
			}
			else {
				System.out.println("impossible de diviser");
			}
		}
		
		
		

	}

}
