package day06_aritmetic_operators;

public class CarDriverInfo {
    public static void main(String[] args){
        String carModel = "Tesla";
        String driverName = "Elon Musk";
        String licencePlate = "VrrrrVrrr12345";
        short speed = 55;
        boolean isAutomatic = true;
        char LicenseClass = 'D';

        System.out.println("Car Model : " + carModel);
        System.out.println(driverName +  " is driving a car");
        System.out.println(driverName+" is driving "+carModel);
        System.out.println("Current speed is: "+speed);
        System.out.println("Current speed is: " + speed + " MPH");
        System.out.println("Ia car automatic -> "  + isAutomatic);
        System.out.println(LicenseClass+ " - " + isAutomatic);


    }
}
