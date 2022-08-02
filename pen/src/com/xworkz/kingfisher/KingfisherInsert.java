package com.xworkz.kingfisher;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class KingfisherInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kingfisher", "root",
				"V@rshinibt");
		System.out.println(connection);
		String insertSQL = "insert into kingfisher.kingfisher_Info values(10,'Kingfisher_Larger','500ml','4.8%','400')";

		Statement statement = connection.createStatement();

		int affected = statement.executeUpdate(insertSQL);
		System.out.println("Affected :" + affected);

	}

}
