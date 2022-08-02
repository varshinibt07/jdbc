package com.xworkz.corejava.abstraction.interface_test;

public class InterfaceTest {

	public static void main(String[] args) {
		Computer computer =new Computer();
		Epson epson =new Epson();
		Sony sony =new Sony();
		computer.slot(sony);
		computer.slot(epson);
		
		
         
	}

}
