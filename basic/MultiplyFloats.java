package com.jlrd.basic;

import java.util.Scanner;

/**
 * Class:
 * Author: José L. Ríos
 * Creation date: 27/02/24
 * Short description:
 * Updates:
 */
public class MultiplyFloats {
    public static void main(String[] args) {
        Scanner floats = new Scanner(System.in);
        float float1, float2;

        System.out.println("Multiply two floating-point numbers");
        System.out.println("Basic arithmetic operations");
        System.out.print("Enter first number: ");
        float1 = floats.nextFloat();
        System.out.print("Enter second number: ");
        float2 = floats.nextFloat();

        System.out.println(float1 + " * " + float2 + " = " + (float1 * float2));

        floats.close();
    }
}
