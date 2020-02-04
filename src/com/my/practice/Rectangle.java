package com.my.practice;

public class Rectangle
{
	private double length;
	private double width;

	public Rectangle()
	{
		length = 0;
		width = 0;
	}

	public Rectangle(final double length, final double width)
	{
		this.length = length;
		setWidth(width);
	}

	public void setLength(final double length)
	{
		this.length = length;
	}

	public void setWidth(final double width)
	{
		this.width = width;
	}

	public double getLength()
	{
		return length;
	}

	public double getWidth()
	{
		return width;
	}

	public double calculatePerimeter()
	{
		return (2 * length) + (2 * width);
	}

	public double calculateArea()
	{
		return length * width;
	}
}
