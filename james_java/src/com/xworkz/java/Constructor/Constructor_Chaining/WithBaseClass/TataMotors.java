package com.xworkz.java.Constructor.Constructor_Chaining.WithBaseClass;

public class TataMotors {
	String name;
	String color;
	
	TataMotors(String name,String clr){
		super("Nandhish");
		System.out.println("Constructed TataMotors object");
		
		this.color=clr;
		this.name=name;
		

}
}
