package com.xworkz.corejava.constructor.constructor_chaining.tatagroups;

public class Tatamotor extends TataGroups {
	String model;
	String color;
	Tatamotor(String chairman){
		super(chairman);
		System.out.println("Constructed TataMotors object");
		this.color="red";
		this.model="nexon";
	}

}
