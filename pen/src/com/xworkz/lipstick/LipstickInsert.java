package com.xworkz.lipstick;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LipstickInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lipstick", "root",
				"V@rshinibt");
		System.out.println(connection);
		String insertSQL = "insert into lipstick.lipstick_Info values(10,'renee','pink','499','matte')";

		Statement statement = connection.createStatement();

		int affected = statement.executeUpdate(insertSQL);
		System.out.println("Affected :" + affected);

	}

}
