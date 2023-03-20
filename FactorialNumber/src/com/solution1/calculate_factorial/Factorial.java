package com.solution1.calculate_factorial;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		// Create a scanner object to take input from the user
		Scanner scanner = new Scanner(System.in);
		// Prompt the user to enter a number
		System.out.print("Enter a number ");
		// Read the number entered by the user
		int num = scanner.nextInt();
		// Close the scanner
		scanner.close();

		    // Check if the entered number is negative
		    if (num < 0) {
		        // Print an error message and return
		        System.out.println("Invalid input");
		        return;
		    }

		    // Calculate the factorial of the entered number
		    long result = factorial(num);
		    // Print the result
		    System.out.println("The factorial of " + num + " is " + result);
		}

		// A recursive method to calculate the factorial of the given number n
		public static long factorial(int n) {
		    // Check if the input is 0 or 1
		    if (n == 0 || n == 1) {
		        // If so, return 1
		        return 1;
		    } else {
		        // Otherwise, call the factorial method recursively
		        return n * factorial(n - 1);
		    }
		}
}
