package day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CrudEcole {
	
	
	public static int addEcole(Statement stmt) throws SQLException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Donner le nom de votre école");
        String nom = sc.nextLine();
        System.out.println("Donner l'adresse de votre école");
        String adresse = sc.nextLine();
        System.out.println("Donner le nombre total d'étudiant de l'école");
        int totaletudiant = sc.nextInt();
        // 1) Insert dans la table ecole
        String sql = "insert into ecole (nom,adresse,totaletudiants) values('" + nom + "','" + adresse + "','" + totaletudiant + "')";
        return stmt.executeUpdate(sql);
    }
    
	
	public static void displayEcoles(Statement stmt) throws SQLException
    {
        ResultSet rs = null;
        String rq = "select * from ecole";
        rs = stmt.executeQuery(rq);
        while (rs.next()) {
            int id = rs.getInt("id");
            String nom = rs.getString("nom");
            String adresse = rs.getString("adresse");
            int totaletudiant = rs.getInt("totaletudiants");
            System.out.println("ID : " + id + " | Nom : " + nom + " | Adresse : " + adresse + " | Totaletudiant : " + totaletudiant);
        }
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
