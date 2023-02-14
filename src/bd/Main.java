package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

	public static void getData(Statement stmt) throws SQLException {
		ResultSet rs = null;
		String rq = "select * from etudiant";

		rs = stmt.executeQuery(rq);

		while (rs.next()) {

			int id = rs.getInt("id");
			String nom = rs.getString("nom");
			String email = rs.getString("email");
			int age = rs.getInt("age");

			System.out.println("ID : " + id + " | Nom : " + nom + " | Email : " + email + " | Age : " + age);
		}
	}

	public static int insertData(Statement stmt) throws SQLException {
		Scanner sc = new Scanner(System.in);

		System.out.println("Donner votre nom");
		String nom = sc.nextLine();

		System.out.println("Donner votre email");
		String email = sc.nextLine();

		System.out.println("Donner votre age");
		int age = sc.nextInt();

		// 1) Insert dans la table Etudiant

		String sql = "insert into etudiant (nom,email,age) values('" + nom + "','" + email + "','" + age + "')";
		int res = stmt.executeUpdate(sql);
		// System.out.println(res);
		return res;
	}

	public static int deleteData(Statement stmt) throws SQLException {
		int res =0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Donner un id");
		int id = sc.nextInt();
		
		if (existe(id, stmt)) {

		String sql = "delete from etudiant where id ='" + id + "'";
		res = stmt.executeUpdate(sql);

	
			System.out.println("Suppression avec sucès");
		} else {
			System.out.println("Etudiant introuvable");
		}
		return res;
	}

	// public void somme(int a, int b) // méthode d'insatnce

	// public static int somme(int a, int b) // méthode de classe
	/*
	 * public static void somme(int a, int b) { System.out.println("La somme = "+
	 * (a+b)); //return (a+b); }
	 */

	public static int updateData(Statement stmt) throws SQLException {
		int res = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Donner un id");
		int id = sc.nextInt();
		sc.nextLine();// recupérer le click sur lt btn entré

		if (existe(id, stmt)) {
			System.out.println("Donner un nom");
			String nom = sc.nextLine();

			System.out.println("Donner un email");
			String email = sc.nextLine();
			
			
			String sql = "update etudiant set nom='" + nom + "', email ='"+email+"' where id ='" + id + "'";
			res = stmt.executeUpdate(sql);
			System.out.println("Mise à jour avec sucès");

		}

		else {
			System.out.println("Etudiant introuvable");
		}

		return res;

	}

	public static boolean existe(int id, Statement stmt) throws SQLException {
		ResultSet rs = null;

		String rq = "select * from etudiant where id = '" + id + "'";

		rs = stmt.executeQuery(rq);

		while (rs.next()) {
			if (rs.getInt("id") == id) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) throws Exception {
		// Main m = new Main(); // création d'une instance
		// m.somme(10,2);
		// Main.somme(10,20);
		// int res = somme(10,20);

		Connection connection = null;
		Statement stmt = null;
		// ResultSet rs = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecoleit", "root", "");
			// System.out.println(connection);
			stmt = connection.createStatement();

			// 1)Lecture de data depuis le clavier
			// insertData(stmt);
			// 2)Affichage de toutes les data de la table étudiant
			getData(stmt);
			// 3)Suppression d'un étduiant
			// deleteData(stmt);
			// 4)Update
			updateData(stmt);
			getData(stmt);

			// System.out.println(connection);
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
