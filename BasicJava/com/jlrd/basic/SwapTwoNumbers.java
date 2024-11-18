package com.jlrd.basic;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        int n1, n2, aux;

        System.out.println("Swap two numbers");
        System.out.print("Enter first number (n1): ");
        n1 = numbers.nextInt();
        System.out.print("Enter second number (n2): ");
        n2 = numbers.nextInt();
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

        aux = n1;
        n1 = n2;
        n2 = aux;

        System.out.println("Swapped numbers:");
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

        numbers.close();
    }
}
