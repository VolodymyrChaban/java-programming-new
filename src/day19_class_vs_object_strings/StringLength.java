package day19_class_vs_object_strings;

public class StringLength {
    public static void main(String[] args) {
        String word = "Tesla";

        System.out.println(word);
        System.out.println(word.length());
        System.out.println("count: " + word.length());
        System.out.println("Wooden spoon".length());
        String firstName = "Volodymyr";
        System.out.println(firstName + " - " + firstName.length());
        int count =  firstName.length();
        System.out.println("count = " + count);

        String password = "abc123";

        if (password.length() >= 6){
            System.out.println("Valid password");
        }else{
            System.out.println("Invalid password");
        }
    }
}
