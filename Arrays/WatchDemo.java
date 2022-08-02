package com.xworkz.corejava.Arrays;

public class WatchDemo {
	public static void main(String[] args) {
		Watch Rolex = new Watch ("Rolex","silver",7500.00,"Digital");
		Watch Samsung = new Watch ("Samsung","black",4500.00,"Analog");
		Watch Noise = new Watch ("noise","pink",5500.00,"Analog");
		Watch Casio  = new Watch ("Casio","blue",6500.00,"Digital");
		Watch Fossil  = new Watch ("Fossil","green",4000.00,"Analog");
		
		Watch[] Watch= {Rolex,Samsung,Casio,Fossil};
		
	for(int i=0; i< Watch.length;i++) {
			if(Watch[i].equals("Analog")) {
				System.out.println(Watch[i]);
		
	}

}
	}
}
	
