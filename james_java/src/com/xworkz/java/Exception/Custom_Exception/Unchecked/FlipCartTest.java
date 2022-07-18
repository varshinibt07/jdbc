package com.xworkz.java.Exception.Custom_Exception.Unchecked;

public class FlipCartTest {

	public static void main(String[] args) {
		
		Product pedigree = new Product("pedigree",7000);
		Product lakmeCream = new Product("lakmeCream",70);
		Product soap = new Product("soap",700);
		Product shampoo = new Product("shampoo",100);
		Product bicycle = new Product(" bicycle",9000);
		
		FlipCart flipcart = new FlipCart();
		
		flipcart.addproduct(pedigree);
		flipcart.addproduct(lakmeCream);
		flipcart.addproduct(soap);
		flipcart.addproduct(shampoo);
		flipcart.addproduct(bicycle);
		
		try {
			Product product = flipcart.getProduct("Book");
			System.out.println(product);
		}
		catch (ProductException e) {
			System.out.println(e);
		}
		
		
	}

}
