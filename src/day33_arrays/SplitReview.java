package day33_arrays;

import java.util.Arrays;

public class SplitReview {
    public static void main(String[] args) {
        String words = "java";
        String[] array = words.split("a");
        System.out.println(array.length);
        int countOfA = array.length -1;
        if (words.endsWith("a")){
            countOfA++;
        }
        System.out.println("count of a = " + countOfA);
        System.out.println("Split with empty String ");
        String[] strArr = words.split("");
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(strArr[2]);
        System.out.println(strArr[3]);

        String word2 = "java1sql2html";
        String [] strArr2 = word2.split("\\d");
        System.out.println(Arrays.toString(strArr2));

        word2 = word2.replaceAll("\\d", "_");
        System.out.println("word2 = " + word2);



        String password = "bcTd123_5";
        if(password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^_&+=]).*$")) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }

    }
}

