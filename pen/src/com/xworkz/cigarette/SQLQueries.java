package com.xworkz.cigarette;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.lipstick.constants.DBProperties;

public class SQLQueries {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection =DriverManager.getConnection("DBProperties.URL.getvalue(),DBProperties.USERNAME.getvalue(),DBProperties.PASSWORD.getvalue()");
		System.out.println(connection);
		String SQL = "Select * from cigarette.cigarette where type='tobacco';";
		
		Statement statement = connection.createStatement();
		ResultSet resultset =statement.executeQuery(SQL);
		boolean rs =resultset.next();
		System.out.println("Affected : "+rs);
		
if(rs) {
	String brand = resultset.getString("brand");
	 System.out.println(brand);
	 String price = resultset.getString(3);
	 System.out.println(price);
	 String price1 =resultset.getString(4);
	 System.out.println(price1);
	 
			 
}
else {
	System.out.println("Data not found");
}
	}

}
