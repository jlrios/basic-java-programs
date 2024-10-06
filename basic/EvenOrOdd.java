package com.jlrd.basic;

import java.util.Scanner;

/**
 * Class:
 * Author: José L. Ríos
 * Creation date: 27/02/24
 * Short description:
 * Updates:
 */
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        int number;

        System.out.println("Even or odd number");
        System.out.print("Enter integer number: ");
        number = numbers.nextInt();

        if ((number % 2) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        numbers.close();
    }
}
