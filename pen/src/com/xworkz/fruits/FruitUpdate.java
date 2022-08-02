package com.xworkz.fruits;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FruitUpdate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/Fruits", "root","V@rshinibt");
		System.out.println(connection);
		String updateSQL = "update Fruit_info set fruit_price ='450' where Fruit_name='cherry'";
		Statement statement = connection.createStatement();
		
		int affected = statement.executeUpdate(updateSQL);
		System.out.println("Affected :" +affected);
	}

}
