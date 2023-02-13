package bd;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

	public static void main(String[] args) {
		Connection connection = null;
		
		 try {
	     
	      Class.forName("com.mysql.jdbc.Driver");
	            
	     connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecoleit",
	                "root", "");
	     
	     System.out.println(connection);
		 }
		 catch(Exception exception) {
			 System.out.println(exception.getMessage());
		 }

	}

}
