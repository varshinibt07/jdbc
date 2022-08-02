package com.xworkz.watches;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class watchInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/watches", "root","V@rshinibt");
		System.out.println(connection);
		String insertSQL = "insert into watches.watch_Info values(10,'fasttrack','digital','6000','stainless steel')";
		
		Statement statement = connection.createStatement();
		
		int affected = statement.executeUpdate(insertSQL);
		System.out.println("Affected :" +affected);

	}

}
