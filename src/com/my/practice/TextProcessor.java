package com.my.practice;

public class TextProcessor {

	public static void main(String[] args) {
		countWords("I love programming");
	}
	
	public static void countWords(String text) {
		String[] words = text.split(" ");
		int numberOfWords = words.length;
	}
}
