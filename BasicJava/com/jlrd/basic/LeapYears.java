package com.jlrd.basic;

public class LeapYears {
    public static void main(String[] args) {
        int initYear = 1900, finalYear = 2050;
        boolean isLeap;

        System.out.println("Leap years from 1900 to 2050:");

        for (int y = initYear; y <= finalYear; y++) {
            if (y % 4 == 0 && y % 100 != 0)
                isLeap = true;
            else
                isLeap = y % 400 == 0;

            if (isLeap)
                System.out.println("The year " + y + " is a leap year");
        }
    }
}