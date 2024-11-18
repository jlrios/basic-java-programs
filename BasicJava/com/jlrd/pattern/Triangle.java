package com.jlrd.pattern;

import java.util.Scanner;

public class Triangle {
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
            aux--;
        }

        maxPattern.close();
    }
}
