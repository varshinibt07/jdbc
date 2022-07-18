package com.xworkz.java.Exception.Custom_Exception.Unchecked;

public class FlipCart {
	Product[] products = new Product[10];
	
	void addproduct(Product product) {
		for (int i =0; i< products.length; i++) {
			if(products[i]==null) {
				products[i] = product;
				System.out.println("product added :"+ products[i]);
				break;
			}
		}
	}
	Product getProduct(String productName) {
		Product product = null;
		for(int i=0;i < products.length; i++) {
		if(products[i] !=null && products[i].getProductName().equals(productName)) {
			product = products[i];
		}
	}
	if(product != null) {
		return product;
	}
	else {
		ProductException pe = new ProductException();
		throw pe;
	}
	
}
}
