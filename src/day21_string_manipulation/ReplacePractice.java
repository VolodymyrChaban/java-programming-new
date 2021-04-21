package day21_string_manipulation;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Locale;

public class ReplacePractice {
    public static void main(String[] args) {
        String word = "cyberTek";
        System.out.println(word.toUpperCase());
        System.out.println(word.replace("cy","u"));
        System.out.println("word = " + word);

        word = word.replace("cyber","uber");
        System.out.println("word = " + word);

        System.out.println(word.replace('u', 'o').replace('r','i'));

        String sentence ="java is fun";
        String withNoSpaces = sentence.replace(" ","");
        System.out.println("withNoSpaces = " + withNoSpaces);
        sentence = sentence.replace("java","selenium").replace("fun","a lot of fun");
        System.out.println("sentence = " + sentence);
        
        String result = "1-48 of over 4,000 result for java book";
        result = result.replace("1-48 of over ", "" )
                .replace(",","")
                 .replace(" result for java book","");
        System.out.println("result = " + result);
    }
}
