package com.xworkz.corejava.Arrays;

public class LipstickDemo {
	public static void main(String[] args) {
		Lipstick lakme = new Lipstick ("lakme","red",10.00);
		Lipstick mac = new Lipstick ("mac","pink",5.00);
		Lipstick myglamm = new Lipstick ("myglamm","green",1.00);
		Lipstick sugar = new Lipstick ("sugar","yellow",3.00);
		Lipstick maybellin = new Lipstick ("maybellin","black",350.00);
		
		Lipstick[] lipstick = {lakme, mac,myglamm,sugar,maybellin};
		
		for(int i=0; i< lipstick.length;i++) {
				if(lipstick[i].price < 10.00) {
					System.out.println(lipstick[i]);
				}
		}

	}

}
