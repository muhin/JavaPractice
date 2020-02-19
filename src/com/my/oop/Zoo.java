package com.my.oop;

public class Zoo {

	public static void main(String[] args) {
		Dog rocky = new Dog();
		rocky.makeSound();
		rocky.fetch();
		feed(rocky);
		
		Animal sasha = new Dog();
		sasha.makeSound();
		
		sasha = new Cat();
		sasha.makeSound();
		((Cat) sasha).scratch();
		feed(sasha);
	}
	
	public static void feed(Animal animal) {
		if(animal instanceof Dog) {
			System.out.println("here's your dog foor.");
		}
		else if(animal instanceof Cat) {
			System.out.println("here's your cat foor.");
		}
	}
}
