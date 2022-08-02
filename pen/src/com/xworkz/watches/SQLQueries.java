package com.xworkz.watches;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.fruits.constants.DBProperties;

public class SQLQueries {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(DBProperties.URL.getvalue(),DBProperties.USERNAME.getvalue(),DBProperties.PASSWORD.getvalue());
		System.out.println(connection);
		String SQL ="select * from watches.watch_info  where watch_strap ='stainless_steel'";
		Statement statement = connection.createStatement();
		ResultSet resultset =statement.executeQuery(SQL);
		boolean rs =resultset.next();
		System.out.println("Affected : "+rs);
	 
	if(rs) {
		String a = resultset.getString("price");
		 System.out.println(a);
		 String d = resultset.getString(3);
		 System.out.println(d);

	}
	else {
		System.out.println("Data not  found");
	}

}
}
