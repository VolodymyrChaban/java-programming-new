package day17_ternary_nested_condition;

public class AmazonPrimeShopping {
    public static void main(String[] args) {
        double itemPrice = 30;
        boolean isPrimeMember = false;
        if(isPrimeMember){
            System.out.println("Eligible for free 2 day shipping");
        }else{
            if (itemPrice >= 25){
                System.out.println("eligible for free regular shipping ");
            }else {
                System.out.println("Not eligible for free shipping");
            }
        }
    }
}
