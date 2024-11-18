package com.jlrd.basic;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        String myName;

        System.out.print("What is your name: ");
        myName = name.nextLine();
        System.out.println("Nice to meet you " + myName);

        name.close();
    }
}