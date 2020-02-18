package com.my.practice;

public class TextProcessor {

	public static void main(String[] args) {
		countWords("I love programming");
		reverseText("Bangladesh");
		System.out.println();
		addSpaces("ILiveInDhaka");
	}
	
	public static void countWords(String text) {
		String[] words = text.split(" ");
		int numberOfWords = words.length;
		System.out.println("Your text contains " + numberOfWords + " words");
		for(int i=0; i<numberOfWords; i++)
			System.out.println(words[i]);
	}
	
	public static void reverseText(String text) {
		System.out.print("Reverse text is: ");
		for(int i=text.length()-1; i>=0; i--)
			System.out.print(text.charAt(i));
	}
	
	public static void addSpaces(String text) {
		StringBuilder modifiedText = new StringBuilder(text);
		for(int i=0; i<modifiedText.length(); i++) {
			if(i!=0 && Character.isUpperCase(modifiedText.charAt(i))) {
				modifiedText.insert(i, " ");
				i++;
			}
		}
		System.out.println("Readable text is: " + modifiedText);
	}
}
