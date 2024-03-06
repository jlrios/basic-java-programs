package com.jlrd.patterns;

import java.util.Scanner;

/**
 * Class:
 * Author: José L. Ríos
 * Creation date: 01/03/24
 * Short description:
 * Updates:
 */
public class RightTriangle {
    public static void main(String []args){
        Scanner maxPattern = new Scanner(System.in);
        int number;
        String starPat = "* ";

        System.out.println("Right pattern triangle");
        System.out.print("Number of stars: ");
        number = maxPattern.nextInt();

        for (int s = 0; s <= number - 1; s++) {
            System.out.println(starPat);
            starPat += "* ";
        }

        maxPattern.close();
    }
}
