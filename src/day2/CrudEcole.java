package day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CrudEcole {
	
	public static void addEcole(Statement stmt)
	{
		//...
	}
	
	public static void displayEcoles(Statement stmt)
	{
		//...
	}

	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		Statement stmt = null;
		
		try {

			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecoleit", "root", "");
			//System.out.println(connection);
			stmt = connection.createStatement();
			
			// 1)Méthode addEcole()
			addEcole(stmt);
			
			// 2)DispalayEcoles()
			
			displayEcoles(stmt);

		} catch (Exception exception) {
			System.out.println("Exception : " + exception.getMessage());
		}

		finally {
			if (connection != null)
				connection.close();
		}
		
		System.out.println("Fin du programme...");

	}

}
