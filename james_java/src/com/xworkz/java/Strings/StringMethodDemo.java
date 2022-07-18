package com.xworkz.java.Strings;

public class StringMethodDemo {
	public static void main(String[] args) {
		
		String name = "Mahendra Singh Dhoni";
		String upperCaseName =name.toUpperCase();
		System.out.println(upperCaseName);
		
		String SirName= "Singh";
		
		String ConcatinatedName= name.concat(SirName);
		System.out.println(ConcatinatedName);
		System.out.println(name.charAt(5));
		
		System.out.println(ConcatinatedName.contains("Dhoni"));
		System.out.println(ConcatinatedName.endsWith("oni"));
		
		String[] splitedstr = ConcatinatedName.split("  ");
		System.out.println(splitedstr.length);
		
	}

}
