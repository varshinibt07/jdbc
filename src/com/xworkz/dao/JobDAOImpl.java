package com.xworkz.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.dto.JobDTO;
import com.xworkz.job.constants.Job_Designation;
import com.xworkz.job.constants.Job_Qualification;

import static com.xworkz.job.constants.DBProperties.*;

public class JobDAOImpl implements JobDAO
{

	@Override
	public boolean save(JobDTO jobDTO) {
		 
		try {
			Connection	connection = DriverManager.getConnection(URL.getvalue(),
					USERNAME.getvalue(),SECRET.getvalue());
			String insert ="insert into job.job_info values(?,?,?,?,?,?)";
			PreparedStatement statement = connection.prepareStatement(insert); 
			System.out.println(insert);
			statement.setInt(1,jobDTO.getJob_id());
			statement.setString(2,jobDTO.getType().getJob());
			statement.setDouble(3,jobDTO.getPackages());
			statement.setString(4,jobDTO.getName().getJob());
			statement.setDouble(5,jobDTO.getPercentage());
			statement.setString(6,jobDTO.getFresher());
			 int rowsAffected = statement.executeUpdate();
			 if(rowsAffected>0) {
				 System.out.println("Data Saved :" +rowsAffected);
			 }
			 else {
				 System.out.println("Data not saved");
			 }
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public JobDTO findBYId(Integer jid) {
	try {
		Connection connection = DriverManager.getConnection(URL.getvalue(),
				USERNAME.getvalue(),SECRET.getvalue());
		String search ="Select * from job.job_info where job_id=?";
		PreparedStatement statement = connection.prepareStatement(search); 
		System.out.println(search);
		statement.setInt(1, jid);
		ResultSet resultSet = statement.executeQuery();
		while(resultSet.next()) {
			Integer id = resultSet.getInt(1);
			String designation = resultSet.getString(2);
			Double ctc = resultSet.getDouble(3);
			String Qualification = resultSet.getString(4);
			Double perc = resultSet.getDouble(5);
			String fresher = resultSet.getNString(6);
			
			JobDTO jobdto = new JobDTO();
			jobdto.setJob_id(id);
			jobdto.setType(Job_Designation.valueOf(designation));
			jobdto.setPackages(ctc);
			jobdto.setName(Job_Qualification.valueOf(Qualification));
			jobdto.setPercentage(perc);
			jobdto.setFresher(fresher);
			return jobdto;		
			
		}
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
		return null;
	}

	@Override
	public JobDTO findByIdAndDesignation(Integer id, String designation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JobDTO findByIdAndDesignationAndQualification(Integer id, String designation, String Qualification) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getTotal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String isFresherById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getMaxPercentage() {
		// TODO Auto-generated method stub
		return null;
	}

	
}