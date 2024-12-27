package codility;

import java.util.Scanner;

public class BinaryGap {
    public static String binaryNumber(int num) {
        return "";
    }
    public static void main(String[] args) {
        Scanner scanNumber = new Scanner(System.in);
        String binNumber = "";

        int num = 0;

        System.out.println("PRG01: Binary Gap");
        
        System.out.print("Enter an integer number: ");
        num = scanNumber.nextInt();

        binNumber = binaryNumber(num);

        scanNumber.close();
    }
}
