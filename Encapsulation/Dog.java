package com.xworkz.corejava.Encapsulation;

public class Dog {
	private String name;
	private String colour;
	private String breed;
	private int age;
	private double price;
	
	public Dog() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age<100) {
		this.age = age;
	}
		else {
			System.out.println("Invalid age value");
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	

}
