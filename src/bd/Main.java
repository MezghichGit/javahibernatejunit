package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		
		 try {
	     
	      Class.forName("com.mysql.jdbc.Driver");
	            
	     connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecoleit","root", "");
	     
	     Statement stmt = connection.createStatement();
	     
	     String sql ="insert into etudiant (nom,email,age) values('sam','sam.mezghich@gmail.com','24')";
	     int res = stmt.executeUpdate(sql);
	     System.out.println(res);
	     
	     //System.out.println(connection);
		 }
		 catch(Exception exception) {
			 System.out.println("Exception : "+ exception.getMessage());
		 }
		 
		 finally {
			 if(connection!=null)
				 connection.close();
		 }

	}

}
