package com.xworkz.pen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PerfumeDelete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/perfume", "root","V@rshinibt");
		System.out.println(connection);
		String deleteSQL = "delete from perfume.company_info where brand='Fog'";
		Statement statement = connection.createStatement();
		
		int affected = statement.executeUpdate(deleteSQL);
		System.out.println("Affected :" +affected);

	}

}
