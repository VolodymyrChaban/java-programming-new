package day16_switch_ternary;

public class ArboroApartments {
    public static void main(String[] args) {
        int numberOfBedrooms = 2;
        double startingPrice = 0;

        System.out.println("#### WELCOME TO ARBORO APARTMENTS ####");

        if (numberOfBedrooms == 0) {
        }
            switch (numberOfBedrooms ){
                case 0:
                    startingPrice = 1454.0;
            System.out.println("Studio apartment selected");
            break;
                case 1:
                    startingPrice = 2000.0;
                System.out.println("One bedroom apartment selected");
                break;
                case 2:
                    startingPrice = 3000.0;
                    System.out.println("Two bedroom apartment selected");
                    break;
                default:
        }
        System.out.println("Starting price " + startingPrice );
    }
}
