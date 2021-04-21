package day20_string_manipulation;

import java.util.Locale;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital one";
        System.out.println(company.contains("i"));
        System.out.println(company.contains("ital"));
        System.out.println(company.contains("l o"));
        System.out.println(company.contains(" "));
        System.out.println(company.contains("j"));
        System.out.println(company.contains("One"));


        String etsyTitle = "Wooden spoon | Etsy";

        if (etsyTitle.contains(" | ")) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        String firstName = "ahmed";

        if (firstName.contains("a") && firstName.contains("e")){
            System.out.println("present");
        }else {
            System.out.println("Not present");
        }

        firstName = "Nadir";
        if (firstName.contains("a") || firstName.contains("i")){
            System.out.println("is present");
        }else {
            System.out.println("Not present");
        }

        String email = "chabannn@.com";
        if (email.contains("@") && email.contains(".com")){
            System.out.println("Correct email");
        }else {
            System.out.println("Incorrect email");
        }

        if (email.toLowerCase().contains("b")){
            System.out.println("present");
        }else {
            System.out.println("Not present");
        }
    }
}
