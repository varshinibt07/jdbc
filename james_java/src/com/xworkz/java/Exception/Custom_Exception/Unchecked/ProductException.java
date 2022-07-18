package com.xworkz.java.Exception.Custom_Exception.Unchecked;

public class ProductException extends RuntimeException{
	@Override
	public String toString() {
		return "Product not found";
	}

}
