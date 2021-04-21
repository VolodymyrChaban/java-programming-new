package day17_ternary_nested_condition;

import java.nio.charset.StandardCharsets;

public class TernaryExamples {
    public static void main(String[] args) {
        int score1 = 80;
        String result1;
        if (score1 > 60) {
            result1 = "Pass";
        }else{
            result1 = "Fail";
        }
        System.out.println("result " + result1);

        //with ternary
        int score = 88;
        String result = (score > 60) ? "Pass" : "Faile";
        System.out.println("result = " + result);

        String quality = "good";
        System.out.println(quality.equals("good") ? 100 : 0);
        int rating = quality.equals("good")? 100 : 0;
        System.out.println("rating = " + rating);

        int score3 = 100;
        char grade = (score > 90) ? 'A' : 'B';
        System.out.println("grade = " + grade);
  //      if (score > 90) {
            grade = 'A';
  //      }else{
            grade = 'B';
    //    }

    }
}
