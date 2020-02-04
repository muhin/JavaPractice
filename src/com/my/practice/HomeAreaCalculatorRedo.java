package com.my.practice;

import java.util.Scanner;

public class HomeAreaCalculatorRedo
{
	private final Scanner scanner = new Scanner(System.in);

	public static void main(final String[] args)
	{
		final HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
		final Rectangle kitchen = calculator.getRoom();
		final Rectangle bathroom = calculator.getRoom();
		final double area = calculator.calculateTotalArea(kitchen, bathroom);
		System.out.println("The total area is: " + area);
		calculator.scanner.close();
	}

	public Rectangle getRoom()
	{
		System.out.println("Enter the length of your room");
		final double length = scanner.nextDouble();

		System.out.println("Enter the width of your room");
		final double width = scanner.nextDouble();

		// final Rectangle room = new Rectangle(length, width);
		// return room;
		return new Rectangle(length, width);
	}

	public double calculateTotalArea(final Rectangle rectangle1, final Rectangle rectangle2)
	{
		return rectangle1.calculateArea() + rectangle2.calculateArea();
	}
}
