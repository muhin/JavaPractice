package com.my.practice;

public class HomeAreaCalculator
{
	public static void main(final String[] args)
	{
		// Rectangle 1
		final Rectangle room1 = new Rectangle();
		room1.setWidth(25);
		room1.setLength(50);
		final double areaOfRoom1 = room1.calculateArea();

		// Rectangle 2

		final Rectangle room2 = new Rectangle(30, 75);
		final double areaOfRoom2 = room2.calculateArea();

		final double totalArea = areaOfRoom1 + areaOfRoom2;

		System.out.println("Area of both rooms: " + totalArea);
	}
}
