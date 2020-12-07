package com.itbulls.learnit.javacore.hw;

import java.util.Scanner;

public class AmountOfWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any text: ");
	    String str = sc.nextLine();
	    
	    int amountOfWords = getWordsAmount(str);
	
		System.out.println("Amount of words in your text: " + amountOfWords);
	}

	public static int getWordsAmount(String text) {
		
		String[] words = text.split(" ");
		
		int amount_words = words.length;
		
		return amount_words;
	}
}
