package com.jlrd.basic;

import java.util.Scanner;

/**
 * Class:
 * Author: José L. Ríos
 * Creation date: 28/02/24
 * Short description:
 * Updates:
 */
public class BinaryAddition {
    public static void main(String[] args) {
        Scanner binaries = new Scanner(System.in);
        String binaryStr1, binaryStr2, binaryAdd = "";
        char cr = ' ';

        System.out.println("Add two binary strings");
        System.out.print("Enter first binary string: ");
        binaryStr1 = binaries.nextLine();
        System.out.print("Enter second binary string: ");
        binaryStr2 = binaries.nextLine();

        for (int i = binaryStr1.length() - 1; i >= 0; i--) {
            char b1, b2;
            b1 = binaryStr1.charAt(i);
            b2 = binaryStr2.charAt(i);

            if (b1 == '0' && b2 == '0') binaryAdd += "0";
            if (b1 == '1' && b2 == '1') {
                binaryAdd += "0";
                cr = '1';
            }

            if (i != 0) binaryAdd += "1";
        }

        System.out.println(binaryStr1 + " + " + binaryStr2 + " = "  +binaryAdd);
    }
}
