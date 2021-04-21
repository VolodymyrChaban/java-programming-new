package day37_methods_overloading;

public class MethodPractice {
    public static void main(String[] args) {
        repeatString("hello",7,'w');
    }
    public static void repeatString(String word, int times, char delimiter){
        for (int i = 0; i <times ; i++) {
            delimiter++;
            System.out.println(word+ " " + delimiter);
        }
    }
}
