package com.xworkz.corejava.Arrays;

public class Lipstick {
	String brand;
	String color;
	double price;
	
	public Lipstick(String brand,String color,double price)
	{
		this.brand = brand;
		this.color = color;
		this.price = price;
		
	}

	@Override
	public String toString() {
		return "Lipstick [brand=" + brand + ", color=" + color + ", price=" + price + "]";
	}
	

}
