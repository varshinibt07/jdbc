package com.xworkz.kingfisher;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class kingfisherDelete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/kingfisher", "root","V@rshinibt");
		System.out.println(connection);
		String deleteSQL = "delete from kingfisher.kingfisher_info where brand='kingfisher_ultra'";
		Statement statement = connection.createStatement();
		
		int affected = statement.executeUpdate(deleteSQL);
		System.out.println("Affected :" +affected);

	}

}
