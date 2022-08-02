package com.xworkz.pen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PerfumeInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/perfume", "root","V@rshinibt");
		System.out.println(connection);
		String insertSQL = "insert into perfume.Company_Info values(05,'secret',240.00,'deo','barevanilla')";
		Statement statement = connection.createStatement();
		
		int affected = statement.executeUpdate(insertSQL);
		System.out.println("Affected :" +affected);
		
		
		
	}
	
	

}
