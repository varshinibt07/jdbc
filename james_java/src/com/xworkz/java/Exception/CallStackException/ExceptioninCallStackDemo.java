package com.xworkz.java.Exception.CallStackException;

public class ExceptioninCallStackDemo {

	   static   int divide(int a,int b) {
			return a/b ;
		}
		static int computeDivision(int a,int b) {
		return divide(a,b);
	}
		
		public static void main(String[] args) {
		
			
		
			//int result = computeDivision(20,0);//exception
	       computeDivision(20,10);
			//System.out.println("result of division : "+result);
		
	}

}
