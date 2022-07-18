package com.xworkz.java.Exception.Complie_time;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ComplieTimeExceptionDemo {

	public static void main(String[] args) {
		try {
			FileReader fd = new FileReader("E:\\acdef.txt");
					
					BufferedReader br = new BufferedReader(fd);
					System.out.println(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Exception caught");
		

	}

}
}
