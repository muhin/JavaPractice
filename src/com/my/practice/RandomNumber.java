package com.my.practice;

import java.util.Random;

public class RandomNumber
{

	public static void main(final String[] args)
	{
		final Random rand = new Random();
		final int die = rand.nextInt(6) + 1;
		System.out.println(die);
		// final Scanner sc = new Scanner(System.in);
		// final String myName = sc.next();
		// sc.close();
		// myMethod(myName);
		myMethod2();

	}

	public static void myMethod(final String name)
	{
		System.out.println("From Method1:" + name);
	}

	public static void myMethod2()
	{
		myMethod("Muhin");
	}

}
