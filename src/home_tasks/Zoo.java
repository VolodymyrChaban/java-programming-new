package home_tasks;

public class Zoo {
    public static void main(String[] args) {

        String name = "ZOOLAND";
        int FoundedDate = 2010;
        String  startingTime = "10:00 AM";
        String closingTime = "8:00 PM";
        boolean openOnHolidays = true;
        boolean hasAquariumSection = true;
        byte numberOfBigCats = 12;
        int numberOfHoofedAnimals = 250;
        byte numberOfReptiles = 46;
        int numberOfBirds = 520;
        byte numberOfPrimates = 100;
        int numberOfEmployees = 700;
        String ticketsCostForAdults = "40$";
        String ticketsCostForUnder13 = "10$";
        String parkRules = "BE NICE AND HAVE FUN ";

        System.out.println("=================================================");
        System.out.println("||                                             ||");
        System.out.println("||             WELCOME TO "+name+"              ||");
        System.out.println("||                                             ||");
        System.out.println("=================================================");
        System.out.println("||                                             ||");
        System.out.println("||              FOUNDED in "+ FoundedDate+"\t\t\t\t   ||");
        System.out.println("||                                             ||");
        System.out.println("||" + " ZOO WORK HOURS :" +"                            ||");
        System.out.println("|| Zoo open at  : " + startingTime +"\t\t\t\t\t   ||");
        System.out.println("|| ZOO close at : " + closingTime+"                      ||" );
        System.out.println("||                                             ||");
        System.out.println("|| Zoo is open on Holidays: " + openOnHolidays+"               ||");
        System.out.println("||                                             ||");
        System.out.println("||                                             ||");
        System.out.println("|| Zoo is amazing and includes AQUARIUM        ||" + "\n\t\t\tTHAT'S is " + hasAquariumSection );
        System.out.println("||                                             ||");
        System.out.println("|| Numbers Of all animals in the zoo:          ||" );
        System.out.println("|| Big cats - " + numberOfBigCats +"\t\t\t\t\t\t\t   ||");
        System.out.println("|| Hoofed animals - " +  numberOfHoofedAnimals +"\t\t\t\t\t       ||");
        System.out.println("|| Reptiles - " + numberOfReptiles +"\t\t\t\t\t\t\t   ||");
        System.out.println("|| Birds - " + numberOfBirds+"\t\t\t\t\t\t\t       ||");
        System.out.println("|| Primates - " + numberOfPrimates+"\t\t\t\t\t\t\t   ||");
        System.out.println("=================================================");
        System.out.println("|| " + numberOfEmployees + ": Lovely Employees Care For All of Them! ||");
        System.out.println("=================================================");

        System.out.println("||                                             ||");
        System.out.println("|| Price for the tickets : Adults - " + ticketsCostForAdults+ "\t\t   ||");
        System.out.println("|| Price for the tickets : under 13 - " + ticketsCostForUnder13+ "\t   ||");
        System.out.println("=================================================");
        System.out.println("||             ATTENTION RULES!!!!! \t\t   ||");
        System.out.println("=================================================");
        System.out.println("||           " + parkRules+"!!!\t\t   ||");
        System.out.println("=================================================");


    }
}
