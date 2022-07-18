package com.xworkz.java.Constructor.Constructor_Chaining.WithinClass;

public class Tiger {
	String name;
	String color;
	String gender;
	
	Tiger(){
	this("bantu","black");

	}
	
	Tiger(String color, String name){
		this.color=color;
		this.name=name;
		System.out.println("Constructor with 2 parameterised");
			
	}
	
	Tiger(String color, String name,  String gender ){
		this.color=color;
		this.name=name;
		this.gender=gender;
		System.out.println("Constructor with 3 parameterised");

}

}
