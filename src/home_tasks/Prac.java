package home_tasks;

import java.util.Scanner;

public class Prac {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long result = 1L;

        for(int i = n; i >= 1; i--){
            result = result * i;
        }


        System.out.println(result);


    }
}
