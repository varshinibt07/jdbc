package com.xworkz.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static com.xworkz.bars.constants.DBProperties.*;


import com.xworkz.dto.BarDTO;

public class BarDAOImpl implements BarDAO{

	@Override
	public boolean save(BarDTO barDTO) {
		try {
			Connection connection = DriverManager.getConnection(URL.getvalue(),USERNAME.getvalue(),SECRET.getvalue());
			
			String insert = "insert into bars.bars_info values("+barDTO.getId()+",'"+barDTO.getName()+"','"+barDTO.getLocation()+"','"+barDTO.getType().getBar()+"',"
					+ "'"+barDTO.getAvgCollectionPerDay()+"','"+barDTO.getAvgCollectionPerMonth()+"')";
			Statement statement = connection.createStatement();
			Integer affected = statement.executeUpdate(insert);
			
			if(affected>0) {
				System.out.println("Data found :"+insert);
				return true;
			}
			else {
				System.out.println("Data not found");
				return false;
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	

}
