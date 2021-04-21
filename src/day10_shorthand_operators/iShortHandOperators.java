package day10_shorthand_operators;

public class iShortHandOperators {
    public static void main(String[] args) {
        int cars = 10;
        System.out.println("cars in parking lot = " + cars);
        cars = cars + 2;
        System.out.println("cars in parking lot = " + cars);
        cars += 5;
        System.out.println("cars in parking lot = " + cars);

        cars -= 6;
        System.out.println("cars in parking lot = " + cars);
        cars = cars - 1;
        cars -= 1;
        System.out.println("cars in parking lot = " + cars);

        int electricCars = 0;
        //cars = cars + electricCars;
        cars += electricCars;
        System.out.println("cars in parking lot = " + cars);
        System.out.println("but Murodill sad remove all the cars!! and put 123 wooden spoon ");
        cars += 123;
        System.out.println("So now " + cars + " WOODEN SPOONS NOW");



        String word = "Java";
        System.out.println("word = " + word);

        word = word + "programming";
        System.out.println("word = " + word);
        word += " is fun";
        System.out.println("word = " + word);

        String selenium = " but \'selenium\' is more fun. ";
        word +=selenium;
        System.out.println("word = " + word);

        word += 12345;
        System.out.println("word = " + word);

        char letter = 'A';
        System.out.println("letter = " + letter);
        letter += 3;
        System.out.println("letter = " + letter);
        letter += 1;
        System.out.println("letter = " + letter);

        double parkingFee = 7.50;
        System.out.println("normal parking fee = " + parkingFee);
        parkingFee /= 2;
        System.out.println("early bird parking fee = " + parkingFee);

        parkingFee -= parkingFee;
        System.out.println("weekend parking fee = " + parkingFee);
    }
}
