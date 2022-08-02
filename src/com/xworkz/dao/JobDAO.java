package com.xworkz.dao;

import com.xworkz.dto.JobDTO;

public interface JobDAO {
	boolean save(JobDTO jobDTO );
	JobDTO findBYId(Integer id);
	JobDTO findByIdAndDesignation(Integer id,String designation);
	JobDTO findByIdAndDesignationAndQualification(Integer id,String designation,String Qualification);
	int getTotal();
	String isFresherById(Integer id);
	Double getMaxPercentage();
}
