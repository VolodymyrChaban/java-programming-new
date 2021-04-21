package day09_scanner_practice;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter f: ");
        //double fahrenheit = 55.0;
        double fahrenheit = scan.nextDouble();
        double celsius = (fahrenheit - 32)*5/9;
        System.out.println("F to c = " + celsius );
    }
}
