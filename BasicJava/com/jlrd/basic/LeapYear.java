package com.jlrd.basic;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner year = new Scanner(System.in);
        int leap;
        boolean isLeap;

        System.out.println("Determine if a year is a leap year.");
        System.out.print("Enter year: ");
        leap = year.nextInt();

        if (leap % 4 == 0 && leap % 100 != 0)
            isLeap = true;
        else
            isLeap = leap % 400 == 0;

         if (isLeap)
             System.out.println("The year " + leap + " is a leap year");
         else
             System.out.println("The year " + leap + " is not a leap year");

         year.close();
    }
}
