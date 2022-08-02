package com.xworkz.pen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.fruits.constants.DBProperties;

public class Sqlquery_perfume {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(DBProperties.URL.getvalue(),DBProperties.USERNAME.getvalue(),DBProperties.PASSWORD.getvalue());
		System.out.println(connection);
		String SQL ="select * from perfume.company_info  where price ='150'";
		Statement statement = connection.createStatement();
		ResultSet resultset =statement.executeQuery(SQL);
		boolean rs =resultset.next();
		System.out.println("Affected : "+rs);
	 
	if(rs) {
		String a = resultset.getString("price");
		 System.out.println(a);
		 String b = resultset.getString(3);
		 System.out.println(b);
	}
	else {
		System.out.println("Data not found");
	}

	}

}
