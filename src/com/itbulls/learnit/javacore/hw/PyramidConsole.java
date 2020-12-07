package com.itbulls.learnit.javacore.hw;

import java.util.Scanner;

public class PyramidConsole {

	public static void main(String[] args) {

		System.out.print("Please, enter height of the pyramid: ");
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		
		for(int i=0; i<height; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=height-2; i>=0; i--) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
