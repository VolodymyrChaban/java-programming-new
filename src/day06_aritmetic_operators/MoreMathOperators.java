package day06_aritmetic_operators;

public class MoreMathOperators {
    public static void main(String[] args){
        int toyotas = 431;
        int hondas = 233;
        int vw = 2;
        int teslas = 20;
        int nissan = 1;
        int bmw = 155;

        int totalCarsInParking = toyotas + hondas + vw + teslas + nissan + bmw;
        System.out.println("here are " + totalCarsInParking + " cars in parking lot");

        String pizza = "hawaiian";
        int slices = 8;
        int people = 4;
        int slicesPerPerson = slices / people;
        System.out.println("There are " + slicesPerPerson + " slices per person");
        System.out.println("We ordered " + pizza + " pizza with " + slices + " slices, " + people + " people ate " + slicesPerPerson + " slace each" );

    }
}
