package com.xworkz.corejava.Object_Class_Methos.Equals;

public class EqualsMethodDemo {
	public static void main(String[] args) {
		
		Ac lg = new Ac("LG","white",30000);
		Ac samsung = new Ac("samsung","Black",35000);
	    Ac lg1 = new Ac("LG","White",30000);
		
		System.out.println(lg.equals(lg1));
	}

}
