package com.xworkz.lipstick;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LipstickDelete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/lipstick", "root","V@rshinibt");
		System.out.println(connection);
		String deleteSQL = "delete from lipstick.lipstick_info where brand='mac'";
		Statement statement = connection.createStatement();
		
		int affected = statement.executeUpdate(deleteSQL);
		System.out.println("Affected :" +affected);

	}

}
