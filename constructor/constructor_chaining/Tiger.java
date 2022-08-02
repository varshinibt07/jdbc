package com.xworkz.corejava.constructor.constructor_chaining;

public class Tiger {
	String name;
	String colour;
	String gender;
	Tiger()
	{
		this("Leo" , "White" , "Female");
		
	}
	Tiger(String name,String clr)
	{
		this.name =name;
		this.colour =clr;
		
		System.out.println("Hello tiger had dinner...");
	}
	Tiger(String name,String clr,String gender)
	{
		this("Rio","Orange");
		this.name=name;
		this.gender=gender;
	}

	
}
