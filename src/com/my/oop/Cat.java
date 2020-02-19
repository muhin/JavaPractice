package com.my.oop;

public class Cat extends Animal{
	
	@Override
	public void makeSound() {
		System.out.println("meowww");
	}
	
	public void scratch() {
		System.out.println("I am a cat. I scratch things.");
	}
}
