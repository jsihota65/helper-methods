package com.sqa.js;

import java.util.Scanner;

public class HelperInputMethods {
	
	private static Scanner scanner = new Scanner(System.in);

	public static double getDouble(String question){
		String input = scanner .nextLine();
		
		double answer = Double.parseDouble(input);
		return answer;
	}
	
	public static char getChar(String question){
		String input = scanner.nextLine();

    
		char answer = input.charAt(0);
		
		return answer;
		
		
	}

	public static void main(String[] args) {
		String doubleQuestion = "Please enter an amount in dollar and cents: ";
		System.out.println(doubleQuestion);
		double amount = getDouble(doubleQuestion);

		
		String charQuestion = "Please enter letter to quit: ";
		System.out.println(charQuestion);
		char answer = getChar(charQuestion);
		
		System.out.println("You entered the letter: " + answer);

		System.out.println(amount);
		System.out.println("Thank you for visiting.");
		
				

	}

}

