package OfficeHours.Practice_03_21_2021;

public class ArmyQualification {
    public static void main(String[] args) {
        String citizenship = "USA";
        boolean resident = true;
        int age = 18;
        if (citizenship.equalsIgnoreCase("USA") || resident) {
            if (age >= 18 && age <= 35) {


            } else {
                System.out.println("Your age must be between 18 to 35 years old");
            }

        }else{
            System.out.println("You must be a U.S. citizen or a resident");

        }
    }
}
