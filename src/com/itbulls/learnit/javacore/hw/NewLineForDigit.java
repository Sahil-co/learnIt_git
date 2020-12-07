package com.itbulls.learnit.javacore.hw;

import java.util.Scanner;

public class NewLineForDigit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any integer");
		String num = sc.next();
		
		for (char c : num.toCharArray()) {
			System.out.println(c);
		}
	}
}
