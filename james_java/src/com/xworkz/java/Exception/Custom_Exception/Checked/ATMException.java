package com.xworkz.java.Exception.Custom_Exception.Checked;

public class ATMException extends Exception {

	
	@Override
	public String toString() {
		return "you crossed daily limit....";
		
	}
	
	public String getMessage() {
		return "Invalid amount entered...";
	}
}

