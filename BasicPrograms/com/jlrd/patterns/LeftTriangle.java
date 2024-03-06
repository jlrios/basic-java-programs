package com.jlrd.patterns;

import java.util.Scanner;

/**
 * Class:
 * Author: José L. Ríos
 * Creation date: 02/03/24
 * Short description:
 * Updates:
 */
public class LeftTriangle {
    public static void main(String []args){
        Scanner maxPattern = new Scanner(System.in);
        int number, aux;
        String starPat = "* ";

        System.out.println("Left pattern triangle");
        System.out.print("Number of stars: ");
        number = maxPattern.nextInt();

        aux = number;

        for (int s = 0; s <= number - 1; s++) {
            for (int p = aux; p >= 2; p--) {
                System.out.print(" ");
            }
            System.out.println(starPat);
            starPat += "* ";
            // starPat += " *"; print "normal triangle"
            aux--;
        }

        maxPattern.close();
    }
}
