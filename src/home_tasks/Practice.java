package home_tasks;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = input.nextInt();
        if(age == 2){
            System.out.println("toddler");
        }else if (age >= 3 && age <=5){
            System.out.println("early childhood");
        }else if(age > 8 ||  age < 10 ){
            System.out.println("elementary");

        }
    }
}
