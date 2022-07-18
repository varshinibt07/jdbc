package com.xworkz.java.Exception.Custom_Exception.Checked;

public class ATMmachine {

	void draw(int amount) throws ATMException {
		if(amount < 100 || amount > 50000 || amount%100 !=0) 
		{
			ATMException atmExp = new ATMException();
			throw atmExp;
			
		}
		else {
			System.out.println("please collect cash....!");
		}
	}
}
