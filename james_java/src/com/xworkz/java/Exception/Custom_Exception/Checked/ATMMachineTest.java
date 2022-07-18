package com.xworkz.java.Exception.Custom_Exception.Checked;

public class ATMMachineTest {

	public static void main(String[] args) {
		
		ATMmachine atmmachine = new ATMmachine();
		int amount =47000;
		try {
			atmmachine.draw(amount); 
		}
		catch(ATMException e) {
			if(amount > 50000) {
				System.out.println(e);
			}
			else {
				System.out.println(e.getMessage());
			}
		}

	}

}
