package day09_scanner_practice;

import java.util.Scanner;

public class Miles2KilometerConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Miles: ");
        //double miles = 10.0;
        double miles = scan.nextDouble();
        double kilometers = miles * 1.609;
        System.out.println(miles + " miles in kilometers; " + kilometers);

    }
}
