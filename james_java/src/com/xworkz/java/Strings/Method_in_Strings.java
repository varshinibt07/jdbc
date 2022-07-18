package com.xworkz.java.Strings;

public class Method_in_Strings {

	public static void main(String[] args) {
		String s ="Bangalore City";
		
		System.out.println(s.length());
		System.out.println("----------------");
		System.out.println(s.toUpperCase());
		System.out.println("----------------");
		System.out.println(s.toLowerCase());
		System.out.println("----------------");
		System.out.println(s.endsWith("se"));
		System.out.println(s.endsWith("Se"));
		System.out.println("----------------");
		System.out.println(s.startsWith("Bang"));
		System.out.println(s.startsWith("bang"));
		System.out.println("----------------");
		System.out.println(s.contains("lore"));
		System.out.println(s.contains("LOre"));
		System.out.println("----------------");
		System.out.println(s.concat("is huge"));  //combine
		System.out.println("----------------");
		System.out.println(s.charAt(13));      //count always from 0 and even space are considered.
		System.out.println(s.charAt(4));		
		System.out.println("----------------");
		System.out.println(s.indexOf('g'));
		
		System.out.println("----------------");
		String a ="varsh";
		String b ="varsh";
		String c ="Varsh";
		System.out.println(a.equals(b));  //case-sensitive 
		System.out.println(b.equals(c));	//case-sensitive
		System.out.println(b.equalsIgnoreCase(c));
		
		System.out.println("----------------");
		
		
	}

}
