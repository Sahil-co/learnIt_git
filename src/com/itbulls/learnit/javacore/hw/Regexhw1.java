package com.itbulls.learnit.javacore.hw;

import java.util.Arrays;
import java.util.Scanner;

public class Regexhw1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any text");
		String str = sc.nextLine();
		
		String[] arr = str.split("[\\s,\\.]");
		
		System.out.println(Arrays.toString(arr));
	}

}
