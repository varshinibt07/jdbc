package com.xworkz.corejava.constructor.constructor_chaining.Bike;

public class Bike {
	String model;
	String colour;
	String price;
	Bike()
	{
		this("ktm","black","80000");
	}
	Bike(String model,String price)
	{
		this.model=model;
		this.price=price;
		System.out.println("Bike name...");
	}
	Bike(String model,String colour,String price)
	{
		this("ktm","80000");
		this.model=model;
		this.price=price;
	}

}
