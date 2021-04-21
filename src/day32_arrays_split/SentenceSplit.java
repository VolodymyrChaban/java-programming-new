package day32_arrays_split;

public class SentenceSplit {
    public static void main(String[] args) {
        String sentence = "java is fun";
        String[] words = sentence.split(" ");
        System.out.println("1 word = " + words[0]);
        System.out.println("2 word = " + words[1]);
        System.out.println("3 word = " + words[2]);
        //System.out.println("3 word = " + words[3]);

        for (String w : words){
            System.out.println(w);
        }

        String googleResult = "About 1,810,000 results (0.68 seconds)";
        String[] b = googleResult.split(" ");
        System.out.println(b[1]);
        System.out.println(b[3].replace("(",""));
        System.out.println(b[3].substring(1));
    }
}
