package com.xworkz.corejava.Encapsulation;

public class DogTest {

	public static void main(String[] args) {
		Dog dog =new Dog();
		
		dog.setName("Bantu");
		dog.setColour("Black");
		dog.setBreed("Frenchie");
		dog.setAge(1);
		dog.setPrice(25000);
		
		System.out.println("Name :" + dog.getName());
		System.out.println("Colour :" + dog.getColour());
		System.out.println("Breed :" + dog.getBreed());
		System.out.println("Age :" + dog.getAge());
		System.out.println("Price :" + dog.getPrice());

	}

}
