package com.solution1.calculate_factorial;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialBigInteger {
	// A static method to calculate factorial of the given number n
	public static BigInteger factorial(int n) {
	    // If the input is a negative number, return null
	    if (n < 0) {
	        return null;
	    }
	    // If the input is 0, return 1
	    if (n == 0) {
	        return BigInteger.ONE;
	    }
	    // Initialize a BigInteger variable with value 1
	    BigInteger result = BigInteger.ONE;
	    // Loop from 1 to n and calculate factorial
	    for (int i = 1; i <= n; i++) {
	        result = result.multiply(BigInteger.valueOf(i));
	    }
	    // Return the final result
	    return result;
	}

	public static void main(String[] args) {
	    // Create a scanner object to take input from the user
	    Scanner scanner = new Scanner(System.in);
	    // Prompt the user to enter a number
	    System.out.print("Enter a number: ");
	    // Read the number entered by the user
	    int number = scanner.nextInt();
	    // Close the scanner
	    scanner.close();

	    // Calculate the factorial of the entered number
	    BigInteger factorial = factorial(number);

	    // If the factorial is null, print an error message
	    if (factorial == null) {
	        System.out.println("Factorial is not defined for negative numbers.");
	    } else {
	        // Otherwise, print the factorial
	        System.out.println("Factorial of " + number + " is: " + factorial);
	    }
	}
}
