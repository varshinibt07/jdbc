package com.xworkz.corejava.Object_Class_Methos.Hashcode;

public class Car {
	
	public String hashcode() {
		return "car brand: "+"kia";
	}
	
	public static void main(String[] args) {
		
		Car c = new Car();
		System.out.println(c.hashcode());
	}

}
