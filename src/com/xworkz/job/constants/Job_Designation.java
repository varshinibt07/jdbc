package com.xworkz.job.constants;

public enum Job_Designation {
	SOFTWARE_ENGINEER("software engineer"),
	ASSOCIATE_SOFTWARE_ENGINEER("asso.software enginner"),
	FULL_STACK_ENGINEER("full stack engineer"),
	TRAINEE("trainee");
	
private String name;
	
	private Job_Designation(String name)
	{
		this.name=name;
	}
	public String getJob() 
	{
		return name;
	}
	

}
