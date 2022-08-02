package com.xworkz.cigarette;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CigaretteUpdate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/Cigarette", "root","V@rshinibt");
		System.out.println(connection);
		String updateSQL = "update cigarette set origin ='Spain' where price='50'";
		Statement statement = connection.createStatement();
		
		int affected = statement.executeUpdate(updateSQL);
		System.out.println("Affected :" +affected);
	}

}
