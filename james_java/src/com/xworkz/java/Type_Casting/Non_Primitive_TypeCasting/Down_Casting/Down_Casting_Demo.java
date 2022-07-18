package com.xworkz.java.Type_Casting.Non_Primitive_TypeCasting.Down_Casting;

public class Down_Casting_Demo {

	public static void main(String[] args) {
		
		Bird bird = new Dove();	//parent reference is holding the child reference
		Dove dove =(Dove)bird;	//down casting,giving parent reference to child reference

		dove.bird();
	}

}
