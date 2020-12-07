package com.itbulls.learnit.javacore.hw;

import java.util.Scanner;

public class SumDigitsInNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter integer: ");
		int number = sc.nextInt();
		
		int sumOfDigits = sumDigitsInNumber(number);
		System.out.println(sumOfDigits);
	}

	public static int sumDigitsInNumber(int number) {
	    int sum=0;
	    int n = number;
	    
		while(n>0){
		    sum += n%10;
		    n = n/10;
		}
		
		return sum;
	}
}