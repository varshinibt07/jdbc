package com.xworkz.pen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PerfumeUpdate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/perfume", "root","V@rshinibt");
		System.out.println(connection);
		String insertSQL = "update company_info set price ='150' where brand='Axe'";
		Statement statement = connection.createStatement();
		
		int affected = statement.executeUpdate(insertSQL);
		System.out.println("Affected :" +affected);

	}

}
