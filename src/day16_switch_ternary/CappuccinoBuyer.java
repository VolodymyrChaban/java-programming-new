package day16_switch_ternary;

public class CappuccinoBuyer {
    public static void main(String[] args) {
        String size = "grande";
        double price = 0.0;
        double calories = 0.0;

        if (size.equals("tall")){
        }
        switch (size){
            case "tall":
                System.out.println("Tall cappuccino please");
                price = 3.69;
                calories = 90;
                break;
            case "grande":
                System.out.println("Grande cappuccino please");
                price = 2.12;
                calories = 700;
                break;
            case "venti":
                System.out.println("Venti cappuccino please");
                price = 2.15;
                calories = 900;
                break;
            default:
                System.out.println("We dont serv");
                break;
        }
        System.out.println("Total price: $" + price);
        System.out.println("total calories : " + calories);

    }
}
