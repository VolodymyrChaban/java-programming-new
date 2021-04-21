package day18_conditions_practice_strings_intro;

public class Authentication {
    public static void main(String[] args) {
        int expected4SSN = 1234;
        int expectedPinCode = 4321;

        int last4SSN = 4444;
        int pinCode = 4321;

        if (expected4SSN == last4SSN  && expectedPinCode == pinCode) {
            System.out.println("Successful");
        }else {
            System.out.println("Unsuccessful");
            if (last4SSN != expected4SSN){
                System.out.println("Last SSn is incorrect");
            }if (expected4SSN != pinCode){
                System.out.println("Pin incorrect");
            }
        }
        }
}
