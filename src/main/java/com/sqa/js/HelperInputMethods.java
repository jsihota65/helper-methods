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


/*
Implement two of the following helper methods below:

// Get a double value from the user
public static double getDouble(String question)

// Get a char value from the user
public static char getChar(String question)

// Get a char value from the user, must be an acceptable value
public static char getChar(String question, char... c)

// Get a String from the user, must be an acceptable value
public static String getString(String question, String... s)

// Create your own helper method that you may find useful



*/