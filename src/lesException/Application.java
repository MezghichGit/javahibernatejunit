package lesException;

public class Application {

	public static void info() throws NullPointerException
	{
		System.out.println("Simple message");
		
		throw new NullPointerException("Juste un test de throw");
	}
	
	public static void main(String[] args) {
		try {
		   info();
		}
		catch(NullPointerException ex)
		{
			System.out.println(ex.getMessage());
		}
	}

}
