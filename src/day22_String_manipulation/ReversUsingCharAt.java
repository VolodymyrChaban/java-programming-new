package day22_String_manipulation;

import java.lang.*;// optional

public class ReversUsingCharAt {
    public static void main(String[] args) {
        String word = "noon";
        System.out.print(word.charAt(3));
        System.out.print(word.charAt(2));
        System.out.print(word.charAt(1));
        System.out.println(word.charAt(0));
        System.out.println(word);
        //print using single statement and concat +
        System.out.println(""+word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0));

        String revers = ""+word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0);
        System.out.println("word = " + revers);
        System.out.println("word2 = " + revers);

        if (word.equalsIgnoreCase(revers)){
            System.out.println("Palindrome word");
        }else{
            System.out.println("Not palindrome");
        }

    }

}
