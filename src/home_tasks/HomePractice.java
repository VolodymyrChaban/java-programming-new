package home_tasks;

import java.util.Scanner;

public class HomePractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        System.out.println("First name: " + email.substring(0,5).toUpperCase());
        System.out.println("Last name: " + email.substring(6,12).toUpperCase());
        System.out.println("Domain: " + email.indexOf(-3));






    }
}

