package day13_conditional_statements;

public class ATMPinCodeProgram {
    public static void main(String[] args) {
        System.out.println("***WELCOME TO TD BANK ATM***");
        int secretPinCode = 1234;
        int inputPinCode = 12389;
        if(secretPinCode == inputPinCode){
            System.out.println("Correct pin");
        }else {
            System.out.println("wrong");
        }
    }
}
