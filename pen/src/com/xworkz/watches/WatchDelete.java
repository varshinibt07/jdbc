package com.xworkz.watches;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class WatchDelete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/watches", "root","V@rshinibt");
		System.out.println(connection);
		String deleteSQL = "delete from watches.watch_info where brand='titan'";
		Statement statement = connection.createStatement();
		
		int affected = statement.executeUpdate(deleteSQL);
		System.out.println("Affected :" +affected);

	}

}
