package com.xworkz.watches.constants;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.atomic.AtomicInteger;

import com.xworkz.lipstick.constants.DBProperties;

public class EnumDemo_watch {
public static void main(String[] args) throws SQLException, ClassNotFoundException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	//Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lipstick", "root",
			//"V@rshinibt");
	Connection connection = DriverManager.getConnection(DBProperties.URL.getvalue(),DBProperties.USERNAME.getvalue(),DBProperties.PASSWORD.getvalue());	
	System.out.println(connection);
	String SQL ="select * from watches.watch_info ";
	Statement statement = connection.createStatement();
	ResultSet resultset =statement.executeQuery(SQL);
	
	AtomicInteger auto = new AtomicInteger();
	
	//int count = 0;
	while(resultset.next()) {
		auto.incrementAndGet();
		String a = resultset.getString("price");
		String d = resultset.getString(3);
		System.out.println(a+ " "+d);
		
}
	System.out.println("total number of rows :" +auto);
}
}
