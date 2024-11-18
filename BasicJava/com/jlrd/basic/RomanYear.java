package com.jlrd.basic;

import java.util.Scanner;

public class RomanYear {
    public static void main(String[] args) {
        Scanner year = new Scanner(System.in);
        int theYear, startYear = 1900, endYear = 2100;

        System.out.println("Convert a year in YYYY format to Roman numerals.");
        System.out.print("Enter year (" + startYear + " - " + endYear + "): ");
        theYear = year.nextInt();

        if (theYear < startYear || theYear > endYear)
            System.out.println("The year should be between 1900 and 2100.");
        else {
            // To do.
        }
    }
}
