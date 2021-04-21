package day29_nestedloop_arrays;

public class StarsNestedLoop {
    public static void main(String[] args) {

        for (int j = 0; j < 5; j++) {
        for (int i = 1; i <= 10; i++) {
            System.out.print("* ");
            }
            System.out.println();
        }
        for(int outer = 1; outer <= 10; outer++){
            for (int inner = 1; inner <= outer; inner++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int outer = 1; outer <= 10; outer++) {
            for (int inner = 10; inner >= outer; inner--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
