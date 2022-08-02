package com.xworkz.corejava.abstraction.Interface.ATM;

public class AtmImplementation implements ATMMachineworks, ATMWithdraw 
{

	@Override
	public void withdraw() {
		System.out.println("you can withdraw money");
		
	}

	@Override
	public void machineworks() {
		System.out.println("Machine works correctly");
		
	}

	
		
	}
	
	
	
		
	


