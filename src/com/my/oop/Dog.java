package com.my.oop;

public class Dog extends Animal {
	
	@Override
	public void makeSound() {
		System.out.println("woof of a dog");
	}
	
	public void fetch() {
		System.out.println("Fetch is fun");
	}
}
