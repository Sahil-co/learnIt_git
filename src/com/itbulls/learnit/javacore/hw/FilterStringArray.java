package com.itbulls.learnit.javacore.hw;

import java.util.Arrays;
import java.util.Scanner;

public class FilterStringArray {
    
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any words separated by space: ");
		String userInput = sc.nextLine();
		System.out.print("Please, enter minumum word length to filter words: ");
		int minLength = sc.nextInt();
		
		String[] words = userInput.split("\\s+");
		String[] filteredWords = filterWordsByLength(minLength, words);
		System.out.println(Arrays.toString(filteredWords));
	}

	
	
	public static String[] filterWordsByLength(int minLength, String[] words) {
		String[] newWords = new String[words.length-minLength];
		
		int j=0;
		
		for(int i=minLength; i<words.length; i++){
		    newWords[j] = words[i];
		    j++;
		}
		
		return newWords;
	}

}