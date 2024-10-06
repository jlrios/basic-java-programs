package com.jlrd.basic;

import java.util.Scanner;

/**
 * Class:
 * Author: José L. Ríos
 * Creation date: 01/03/24
 * Short description:
 * Updates:
 */
public class ThreeNumbers {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        int n1, n2, n3, larNum;

        System.out.println("Find the largest number among the 3.");
        System.out.print("Enter first number: ");
        n1 = numbers.nextInt();
        System.out.print("Enter second number: ");
        n2 = numbers.nextInt();
        System.out.print("Enter third number: ");
        n3 = numbers.nextInt();

        if (n1 > n2)
            larNum = n1;
        else
            larNum = n2;
        if (larNum < n3) larNum = n3;

        System.out.println("The largest number is: " + larNum);
    }
}
