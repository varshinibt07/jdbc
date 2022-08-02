package com.xworkz.corejava.Object_Class_Methos.Hashcode;



public class Employee {
	
	public int hashcode() {
		return 1234;
	}
	
	public static void main(String[] args) {
		Employee e =new Employee();
		
		System.out.println(e.hashcode());
	}

}

	


