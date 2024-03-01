package com.jlrd.basic;

import java.util.Scanner;

/**
 * Class:
 * Author: José L. Ríos
 * Creation date: 29/02/24
 * Short description:
 * Updates:
 */
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        int prime = 0, max = 100;

        System.out.println("Determine the prime numbers in a range from 1 to " + max);

        for (int n = 5; n <= max; n+=2) {
            for (int p = 1; p <= n; p+=2) {
                if (n % p == 0) prime++;
            }
            if (prime == 2 ) System.out.println(n + " is a prime number");
            prime = 0;
        }
    }
}