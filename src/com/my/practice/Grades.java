package com.my.practice;

import java.util.Scanner;

public class Grades {
	private static int[] grades;
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("How many grades would you like to enter?");
		grades = new int[scanner.nextInt()];
		getGrades();
		System.out.println("Total grade point: " + calculateSum());
		System.out.println("Average: " + String.format("%.2f", calculateAvg()));
		System.out.println("Gighest grade: " + getHighest());
	}
	
	public static void getGrades() {
		for(int i = 0; i < grades.length; i++) {
			System.out.println("Enter grade #" + (i + 1));
			grades[i] = scanner.nextInt();
		}
	}
	
	public static int calculateSum() {
		Integer sum = 0;
		for(int grade : grades) {
			sum = sum + grade;
		}
		return sum;
	}
	
	public static double calculateAvg() {
		return (double)calculateSum()/grades.length;
	}
	
	public static int getHighest() {
		int highest = grades[0];
		for(int grade : grades) {
			if(grade > highest)
				highest = grade;
		}
		return highest;
	}
}
