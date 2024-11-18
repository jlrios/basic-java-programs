package com.jlrd.pattern;

import java.util.Scanner;

public class LeftTriangle {
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
