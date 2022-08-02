package com.xworkz.job.constants;

public enum Job_Qualification {
BE("be"),
BCA("bca"),
BTECH("btech"),
MTECH("mtech");
	
	
private String name;
	
	private Job_Qualification(String name)
	{
		this.name=name;
	}
	public String getJob() 
	{
		return name;
	}
}
