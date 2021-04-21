package day23_string_manipulation_while_loop;

import day04_variables_intro.DeclarationTypes;

public class ChainingStringMethods {
    public static void main(String[] args) {
       String word = "woo den sp oon";

        System.out.println(word.toUpperCase().toLowerCase().length());

        System.out.println(word.replace(" ","").toUpperCase());

        String city = "chicago";
        System.out.println(city.substring(0,1).toUpperCase()+city.substring(1));
        String capitalized = city.substring(0,1).toUpperCase()+city.substring(1);
        System.out.println("capitalized = " + capitalized);
    }
}
