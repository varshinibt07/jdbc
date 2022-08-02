package com.xworkz.fruits;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FruitDelete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/fruits", "root","V@rshinibt");
		System.out.println(connection);
		String deleteSQL = "delete from fruits.fruit_info where fruit_type='sour'";
		Statement statement = connection.createStatement();
		
		int affected = statement.executeUpdate(deleteSQL);
		System.out.println("Affected :" +affected);


	}

}
