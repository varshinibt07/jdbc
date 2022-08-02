package com.xworkz.lipstick.constants;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.atomic.AtomicInteger;

public class EnumDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lipstick", "root",
				//"V@rshinibt");
		Connection connection = DriverManager.getConnection(DBProperties.URL.getvalue(),DBProperties.USERNAME.getvalue(),DBProperties.PASSWORD.getvalue());	
		System.out.println(connection);
		String SQL ="select * from lipstick.lipstick_info  where brand ='sugar'";
		Statement statement = connection.createStatement();
		ResultSet resultset =statement.executeQuery(SQL);
		
		AtomicInteger auto = new AtomicInteger();
		
		//int count = 0;
		while(resultset.next()) {
			auto.incrementAndGet();
			//count++;
		
			String color = resultset.getString("color");
			//String price = resultset.getNString("price");
			//String brand = resultset.getNString(3);
			String c = resultset.getNString(4);
			System.out.println(color+ " "+c);
			
		}	
		System.out.println("Total number of rows :" +auto);
		}
}

