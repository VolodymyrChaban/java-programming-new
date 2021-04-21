package day12_conditional_statements;

import java.util.Scanner;

public class AmazonFreeShipping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter total price");
        double totalPrice = scan.nextDouble();
        if(totalPrice >= 25.0){
            System.out.println("Free shipping: $" + totalPrice);
        }else{
            System.out.println("not free shipping #" + totalPrice);
        }
        System.out.println("Thanks for shopping Amazon");


    }
}
