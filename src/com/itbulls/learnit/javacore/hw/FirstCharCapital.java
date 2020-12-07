package com.itbulls.learnit.javacore.hw;

import java.util.Arrays;
import java.util.Scanner;

public class FirstCharCapital {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any text: ");
		String userInput = sc.nextLine();
		
		
		System.out.println(firstCharToTitleCase(userInput));
	}

	public static String firstCharToTitleCase(String str) {
		String result = "";
		
		str = str.toLowerCase();
		
		String[] arr = str.split(" ");
		
		for(int i=0; i<arr.length; i++) {
		   arr[i] = arr[i].Character
		}
		
		System.out.println(Arrays.toString(arr));
		return result;
	}
}