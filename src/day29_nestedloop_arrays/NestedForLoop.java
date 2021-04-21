package day29_nestedloop_arrays;

public class NestedForLoop {
    public static void main(String[] args) {
        for (int min = 0; min <= 5; min++) {
            System.out.println("\nminutes = " + min);
            for (int sec = 0; sec <= 60; sec++) {
                System.out.print(sec+"");


                //for (int hour = 0; hour < 24; hour++) {
                   // System.out.println( );
               // }
            }
        }

        for (int min = 0; min <=4; min++){
            for (int seconds = 0; seconds <= 59; seconds++){
                System.out.println(min + ":" + seconds);
            }
        }
    }
}
