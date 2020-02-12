package com.my.practice;

import java.util.Arrays;
import java.util.Random;

public class Array {
	private static final int LENGTH = 10;
	private static final int MAX_TICKET_NUMBER = 69;
	
	public static void main(String[] args) {
		int[] ticket = generateLotteryTicket();
		Arrays.sort(ticket);
		printTicket(ticket);
	}
	
	public static int[] generateLotteryTicket() {
		Random random = new Random();
		int[] lotteryTicket = new int[LENGTH];
		int randomNumber;
		for(int i = 0; i < LENGTH; i++) {
			//lotteryTicket[i] = random.nextInt(MAX_TICKET_NUMBER) + 1;
			do {
				randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
			}while(searchDuplicate(lotteryTicket, randomNumber));
			
			lotteryTicket[i] = randomNumber;
		}
		return lotteryTicket;
	}
	
	public static void printTicket(int[] ticket) {
		for(int i=0; i<LENGTH; i++) {
			System.out.print(ticket[i] + "|");
		}
	}
	
	public static boolean searchDuplicate(int[] array, int numberToSearchFor) {
		for(int value : array) {
			if(value == numberToSearchFor)
				return true;
		}
		return false;
	}
}
