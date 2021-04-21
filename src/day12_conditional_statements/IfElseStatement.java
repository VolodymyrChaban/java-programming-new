package day12_conditional_statements;

public class IfElseStatement {
    public static void main(String[] args) {
        if(10 > 5){
            System.out.println("Condition is true");
        }else {
            System.out.println("Condition is false");
        }

        int count = 25;
        if (count > 30){
            System.out.println("Is more then 30");
        }else {
            System.out.println("Is less then 30");
        }

        byte age = 14;
        if(age >= 18){
            System.out.println("You eligible to vote");
            System.out.println("Age is greater or equal to 18");
        }else{
            System.out.println("Tou not eligible to vote");
            System.out.println("Age is less then 18");
        }
    }
}
