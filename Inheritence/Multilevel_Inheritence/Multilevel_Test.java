package com.xworkz.corejava.Inheritence.Multilevel_Inheritence;

public class Multilevel_Test {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Dog dog = new Dog();
		Puppy puppy =new Puppy();
		
		animal.Animaleats();
		dog.DogBarks();
		puppy.PuppyPlays();
		puppy.Animaleats();

	}

}
