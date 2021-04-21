package day24_loops;

public class Alphabet {
    public static void main(String[] args) {
        //a-z
        char letter = 'a';
        while (letter <= 'z'){
            System.out.print(letter+" ");
            letter++;
        }
       // System.out.println("letter = " + letter);
        //letter++;
        ///System.out.println("letter = " + letter);
        System.out.println();

        char letterTwo = 'z';
        while (letterTwo >= 'a') {
            System.out.print(letterTwo + " ");
            letterTwo--;
        }
    }
}
