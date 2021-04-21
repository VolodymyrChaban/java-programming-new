package day21_string_manipulation;

public class FirstAndLastTest {
    public static void main(String[] args) {
        String word1 = "MOM";
        char first = word1.charAt(0);

        char last = word1.charAt(2);

        if (first == last){
            System.out.println("Match");
        }else{
            System.out.println("Not Match");
        }
        if (word1.charAt(0) == word1.charAt(2)){
            System.out.println("First and last match");
        }else {
            System.out.println("Not Match");
        }

        String friend = "aziza";
        char firstLatter = friend.charAt(0);
        char lastLetter = friend.charAt(friend.length()-1 );
        System.out.println(firstLatter);
        System.out.println(lastLetter);



    }
}
