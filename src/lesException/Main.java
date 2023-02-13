package lesException;

public class Main {

	public static void main(String[] args) {
		
		// cas 1 : NullPointerException
		//String formation="java";
		/*
		String formation=null;
		System.out.println(formation.length());*/
		
		// cas 2 : ArithmeticException
		/*
		int x = 10;
		int y = 0;
		
		System.out.println("x/y = "+(x/y));*/
		
		
		// cas 3 : ArrayIndexOutOfBoundsException
		/*
		int tab[] = new int[3]; //0 ..2
		tab[0] = 10;
		tab[1] = 20;
		tab[2] = 30;
		for(int i = 0; i<=tab.length; i++)
		{
			System.out.print(tab[i]+"\t");
		}*/
		
		//String formation="java";
		String formation=null;
		try {
		   System.out.println(formation.length());
		}
		catch(Exception ex)
		//catch(NullPointerException ex)
		{
			System.out.println("Problème..."+ex.getMessage());
			ex.printStackTrace();
			return;  // provoque une sortie immédiate de la méthode
			
		}
		finally {
		  System.out.println("Suite du programme ...");
		}
	}

}
