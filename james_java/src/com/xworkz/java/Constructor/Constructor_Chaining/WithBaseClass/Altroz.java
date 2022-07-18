package com.xworkz.java.Constructor.Constructor_Chaining.WithBaseClass;

public class Altroz extends TataMotors
{
	String altrozmodel;
	double price;
	
	Altroz(String alt, double price){
		super( "range rover","Black");
	System.out.println("constructed Altroz object ");
		this.altrozmodel=alt;
		this.price=price;
		

}
}
