package lesException;

public class Application {
	
	public static void affichage() throws Exception //exception checked
	{
		System.out.println("Simple message");
		throw new Exception("Juste un test de throw");
	}

	public static void info() throws NullPointerException // unchecked exception
	{
		System.out.println("Simple message");
		
		throw new NullPointerException("Juste un test de throw");
	}
	
	public static void main(String[] args) throws Exception {
		affichage();
		/*try {
		    affichage();
		}
		catch(Exception ex)
		{//..}
		*/
		//info();
		
		/*
		info();
		
		try {
		   info();
		}
		catch(NullPointerException ex)
		{
			System.out.println(ex.getMessage());
		}*/
	}

}
