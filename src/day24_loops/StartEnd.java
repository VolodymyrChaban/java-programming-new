package day24_loops;

import java.util.Scanner;

public class StartEnd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter start and end");
        int start = s.nextInt();
        int end = s.nextInt();
        for (int i = start; i <= end; i++) {
            System.out.print(i+" ");
        }
        if (start > end){
            System.out.println("Revers number is not supported");
        }
    }
}
