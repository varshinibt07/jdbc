package com.xworkz.fruits;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class fruitsInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/fruits", "root","V@rshinibt");
		System.out.println(connection);
		String insertSQL = "insert into fruits.fruit_Info values(7,'sugarcane','30','yellowish','sweet')";
		
		Statement statement = connection.createStatement();
		
		int affected = statement.executeUpdate(insertSQL);
		System.out.println("Affected :" +affected);
	}

}
