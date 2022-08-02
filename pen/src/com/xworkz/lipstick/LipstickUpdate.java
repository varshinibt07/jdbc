package com.xworkz.lipstick;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LipstickUpdate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/lipstick", "root","V@rshinibt");
		System.out.println(connection);
		String updateSQL = "update lipstick_info set type ='glossy' where Brand='lakme'";
		Statement statement = connection.createStatement();
		
		int affected = statement.executeUpdate(updateSQL);
		System.out.println("Affected :" +affected);

	}

}
