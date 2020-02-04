package com.my.practice;

import java.util.Random;

public class Array {
	private static final int LENGTH = 6;
	private static final int MAX_TICKET_NUMBER = 69;
	
	public static void main(String[] args) {
		int[] ticket = generateLotteryTicket();
		printTicket(ticket);
	}
	
	public static int[] generateLotteryTicket() {
		Random random = new Random();
		int[] lotteryTicket = new int[LENGTH];
		for(int i=0; i<LENGTH; i++) {
			lotteryTicket[i] = random.nextInt(MAX_TICKET_NUMBER)+1;
		}
		return lotteryTicket;
	}
	public static void printTicket(int[] ticket) {
		for(int i=0; i<LENGTH; i++) {
			System.out.print(ticket[i] + "|");
		}
	}
}
