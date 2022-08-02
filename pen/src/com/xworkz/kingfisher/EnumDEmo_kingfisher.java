package com.xworkz.kingfisher;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.atomic.AtomicInteger;

import com.xworkz.lipstick.constants.DBProperties;

public class EnumDEmo_kingfisher {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lipstick", "root",
				//"V@rshinibt");
		Connection connection = DriverManager.getConnection(DBProperties.URL.getvalue(),DBProperties.USERNAME.getvalue(),DBProperties.PASSWORD.getvalue());	
		System.out.println(connection);
		String SQL ="select * from kingfisher.kingfisher_info ";
		Statement statement = connection.createStatement();
		ResultSet resultset =statement.executeQuery(SQL);
		
		AtomicInteger auto = new AtomicInteger();
		
		//int count = 0;
		while(resultset.next()) {
			auto.incrementAndGet();
			//count++;
			String brand = resultset.getString("brand");
			String r = resultset.getString("brand");

	}
		System.out.println("total number of rows :" +auto);
	}
}
