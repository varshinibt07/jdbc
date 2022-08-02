package com.xworkz.kingfisher;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class KingfisherUpdate {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/kingfisher", "root","V@rshinibt");
		System.out.println(connection);
		String updateSQL = "update kingfisher_info set price ='300' where quantity='560ml'";
		Statement statement = connection.createStatement();
		
		int affected = statement.executeUpdate(updateSQL);
		System.out.println("Affected :" +affected);


	}

}
