package com.my.oop;

public class InheritanceTester {

	public static void main(String[] args) {
		//Person person = new Person();
		//Employee employee = new Employee();
//		Rectangle rectangle = new Rectangle();
//		rectangle.print();
//		
//		Square square = new Square();
//		square.print("Square");
		
		Mother mom = new Mother();
		mom.setName("LoL");
		System.out.println(mom.getName() + " is a " + mom.getGender());
	}
}
