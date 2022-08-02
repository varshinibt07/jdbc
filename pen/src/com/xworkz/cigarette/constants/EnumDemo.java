package com.xworkz.cigarette.constants;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.atomic.AtomicInteger;

import com.xworkz.lipstick.constants.DBProperties;

public class EnumDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lipstick", "root",
				//"V@rshinibt");
		Connection connection = DriverManager.getConnection(DBProperties.URL.getvalue(),DBProperties.USERNAME.getvalue(),DBProperties.PASSWORD.getvalue());	
		System.out.println(connection);
		String SQL ="select * from lipstick.lipstick_info ";
		Statement statement = connection.createStatement();
		ResultSet resultset =statement.executeQuery(SQL);
		
		AtomicInteger auto = new AtomicInteger();
		
		//int count = 0;
		while(resultset.next()) {
			auto.incrementAndGet();
			//count++;
			
			String brand = resultset.getString("brand");
			String price = resultset.getString(3);
			String price1 =resultset.getString(4);
			System.out.println(brand+ " "+price+ " "+price1);
	}
		System.out.println("total number of rows :" +auto);

}
}
