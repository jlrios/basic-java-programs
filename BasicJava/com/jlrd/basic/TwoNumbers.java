package com.jlrd.basic;

import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        int number1, number2;

        System.out.println("Basic arithmetic operations.");
        System.out.print("Enter first number: ");
        number1 = numbers.nextInt();
        System.out.print("Enter second number: ");
        number2 = numbers.nextInt();

        System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
        System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
        System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
        System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));

        numbers.close();
    }
}
