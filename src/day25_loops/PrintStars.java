package day25_loops;

public class PrintStars {
    public static void main(String[] args) {
        int stars = 0;
        for (stars = 1;stars <= 15; stars++){
            System.out.print("* ");
        }
        System.out.println();
        String myStars = "";
        for (int starss = 1; starss <= 5; starss++){
            myStars += "* ";
        }
        System.out.println("myStars = " + myStars.trim());


    }
}
