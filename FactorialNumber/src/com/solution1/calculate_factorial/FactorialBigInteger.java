package com.solution1.calculate_factorial;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialBigInteger {
	public static BigInteger factorial(int n) {
        if (n < 0) {
            return null;
        }
        if (n == 0) {
            return BigInteger.ONE;
        }
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        BigInteger factorial = factorial(number);

        if (factorial == null) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            System.out.println("Factorial of " + number + " is: " + factorial);
        }
    }
}
