package OfficeHours.Practice_04_21_2020;

public class PalindromeNumber {
    public static void main(String[] args) {

        System.out.println(112 % 1);
        System.out.println(112 % 10);
        System.out.println(112 %  100);
        System.out.println(isPalindrome(12335));
    }

    public static boolean isPalindrome(int number){

        while (number != 0) {
            System.out.println("last digit " + number % 10);
            number /= 10; // number = number / 10;
            System.out.println("number after /10 " +number);
            System.out.println();
        }
        return false;
    }


}
