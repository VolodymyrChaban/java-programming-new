package day32_arrays_split;

import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {
        String words = "java,python,selenium,html";
        String[] wordsArray = words.split(",");
        System.out.println("first word = " + wordsArray[0]);
        System.out.println(Arrays.toString(wordsArray));
        System.out.println("length of array = " +wordsArray.length);

        //

        for (String each : wordsArray){
            System.out.println(each);
        }
        String sentence = "today I am coding java arrays";
        String[] wordArray = sentence.split(" ");
        System.out.println(Arrays.toString(wordArray));
        System.out.println("length = " +wordArray);
        System.out.println("Number of words = " + wordArray.length);

        for (String each : wordArray){
            System.out.println(each);
        }
    }
}
