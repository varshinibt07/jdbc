package com.xworkz.java.Exception.Custom_Exception.Unchecked;

public class DmartLoginDemo {

	public static void main(String[] args) {
		
			String product = "MI123";
			int product_price= 5000;
			
			if(product.equals("MI123")) {
				if(product_price<4000 || product_price==4000) {
					System.out.println("Product found..");
				}
				else {
					try {
					Dmartlogin dl = new Dmartlogin();
					throw dl;
					} catch(Dmartlogin e) {
						System.out.println("Product not found..");
						
					}
				}
			}
		}

	}


