package com.xworkz.corejava.Array;

public class Watch {
	String brand;
	String color;
	double price;
	String type;
	
	public Watch(String brand,String color,double price,String type) 
	{
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.type = type;
		
	}

	@Override
	public String toString() {
		return "Watch [brand=" + brand + ", color=" + color + ", price=" + price + ", type=" + type + "]";
	}

	
}