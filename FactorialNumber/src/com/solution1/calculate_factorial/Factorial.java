package com.solution1.calculate_factorial;

import java.util.Scanner;

public class Factorial {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number ");
	        int num = scanner.nextInt();
	        scanner.close();
	        
	        if (num < 0) {
	            System.out.println("Invalid input");
	            return;
	        }
	        
	        int result = factorial(num);
	        System.out.println("The factorial of " + num + " is " + result);
	    }
	    
	    public static int factorial(int n) {
	        if (n == 0 || n == 1) {
	            return 1;
	        } else {
	            return n * factorial(n - 1);
	        }
	    }
}
