package com.xworkz.dto;

import com.xworkz.job.constants.Job_Designation;
import com.xworkz.job.constants.Job_Qualification;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class JobDTO {
	private  Integer job_id;
	private Job_Designation type =Job_Designation.SOFTWARE_ENGINEER;
	private Double packages;
	private Job_Qualification name = Job_Qualification.BE;
	private Double percentage;
	private String fresher;
	
}
