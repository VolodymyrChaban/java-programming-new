package day39_wrapper_classes;

public class ParsString {
    public static void main(String[] args) {
        String price = "1000";
        int count = Integer.parseInt(price);
        System.out.println(count);


        String strPrice = "123.4";

        double num = Double.parseDouble(strPrice);
        if (num > 100) {
            System.out.println(num);
        }else{
            System.out.println("Not more then 100");
        }

        String sentence = "I wrote 100 lines of code";
        String [] sss = sentence.split(" ");

        int linesOfCode = Integer.parseInt(sss[2]);
        System.out.println(linesOfCode);
    }
}