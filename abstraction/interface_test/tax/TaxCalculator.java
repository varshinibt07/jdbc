package com.xworkz.corejava.abstraction.interface_test.tax;

public class TaxCalculator implements CentralTax, StateTax {
	

	@Override
	public void State() {
	System.out.println("State tax is 500rs");
		
	}
	
	@Override
	public void central() {
	System.out.println("central tax is 100rs");
		
	}

}
