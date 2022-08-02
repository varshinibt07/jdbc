package com.xowrkz.job;

import com.xworkz.dao.JobDAO;
import com.xworkz.dao.JobDAOImpl;
import com.xworkz.dto.JobDTO;
import com.xworkz.job.constants.Job_Designation;
import com.xworkz.job.constants.Job_Qualification;

public class JobRunner {

	public static void main(String[] args) {
		JobDTO jobdto = new JobDTO(6,Job_Designation.FULL_STACK_ENGINEER,560000.00D,
				Job_Qualification.BE,76.00D,"yes");
		JobDAO jobdao = new JobDAOImpl();
		jobdao.save(jobdto);
		
		jobdao.findBYId(1);
	}

}
