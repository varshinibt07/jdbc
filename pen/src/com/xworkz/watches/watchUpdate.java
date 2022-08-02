package com.xworkz.watches;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class watchUpdate {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/watches", "root","V@rshinibt");
		System.out.println(connection);
		String updateSQL = "update watch_info set price ='4500' where price='3000'";
		Statement statement = connection.createStatement();
		
		int affected = statement.executeUpdate(updateSQL);
		System.out.println("Affected :" +affected);

	}

}
