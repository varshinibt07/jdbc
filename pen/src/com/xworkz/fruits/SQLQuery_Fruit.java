package com.xworkz.fruits;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.fruits.constants.DBProperties;

public class SQLQuery_Fruit {

	
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(DBProperties.URL.getvalue(),DBProperties.USERNAME.getvalue(),DBProperties.PASSWORD.getvalue());
			System.out.println(connection);
			String SQL ="select * from fruits.fruit_info  where fruit_name ='apple'";
			Statement statement = connection.createStatement();
			ResultSet resultset =statement.executeQuery(SQL);
			boolean rs =resultset.next();
			System.out.println("Affected : "+rs);
		 
		if(rs) {
			String p = resultset.getString("fruit_price");
			 System.out.println(p);
			 String q = resultset.getString(4);
			 System.out.println(q);
			 
			 
		}
		else {
			System.out.println("Data not found");
		}

	}

}
