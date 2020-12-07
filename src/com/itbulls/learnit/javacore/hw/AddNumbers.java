package com.itbulls.learnit.javacore.hw;

public class AddNumbers {

	public static void main(String[] args) {

		String number1 = args[0];
		String number2 = args[1];
		
		if(number1.contains(".") || number2.contains(".")) {
			double num1 = Double.parseDouble(number1);
			double num2 = Double.parseDouble(number2);
			
			System.out.println("Sum of two numbers is: "+(num1+num2));
		}
		else {
			int num1 = Integer.parseInt(number1);
			int num2 = Integer.parseInt(number2);
			
			System.out.println("Sum of two numbers is: "+(num1+num2));
		}
	}

}
