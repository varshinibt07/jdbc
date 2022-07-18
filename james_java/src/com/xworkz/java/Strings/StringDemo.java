package com.xworkz.java.Strings;

public class StringDemo {
	public static void main(String[] args) {
		
		String name ="Varshini";
		String name1 ="Varshini";
		
		System.out.println(name == name1);
		String megha = new String("megha");
		String internMegha = megha.intern()	;
		
		System.out.println(megha == internMegha);
		String meghs = "megha";
		
		System.out.println(internMegha == meghs);
		
		name1 ="Shakthi";
		
		System.out.println(name == name1);
		
	}

}
