package com.xworkz.kingfisher;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.fruits.constants.DBProperties;

public class SQLQuery_kingfisher {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(DBProperties.URL.getvalue(),DBProperties.USERNAME.getvalue(),DBProperties.PASSWORD.getvalue());
		System.out.println(connection);
		String SQL ="select * from kingfisher.kingfisher_info  where quantity ='560ml'";
		Statement statement = connection.createStatement();
		ResultSet resultset =statement.executeQuery(SQL);
		boolean rs =resultset.next();
		System.out.println("Affected : "+rs);
	 
	if(rs) {
		String brand = resultset.getString("brand");
		 System.out.println(brand);
		 String r = resultset.getString("brand");
		 System.out.println(r);
			
	}
	else {
		System.out.println("Data not foound");
	}
	}

}
