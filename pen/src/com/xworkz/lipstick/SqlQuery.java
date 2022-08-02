package com.xworkz.lipstick;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.lipstick.constants.DBProperties;

public class SqlQuery {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(DBProperties.URL.getvalue(),DBProperties.USERNAME.getvalue(),DBProperties.PASSWORD.getvalue());
		System.out.println(connection);
		String SQL ="select * from lipstick.lipstick_info  where brand ='sugar'";
		Statement statement = connection.createStatement();
		ResultSet resultset =statement.executeQuery(SQL);
		boolean rs =resultset.next();
		System.out.println("Affected : "+rs);
	 
	if(rs) {
		
	
		 String color = resultset.getString("color");
		 System.out.println(color);
		 String price = resultset.getNString("price");
		 System.out.println(price);
		 String brand = resultset.getString(3);
		 System.out.println(brand);
		 String c = resultset.getNString(2);
		 System.out.println(c);
	}
	else {
		System.out.println("Data not found");
	}
	}

}
