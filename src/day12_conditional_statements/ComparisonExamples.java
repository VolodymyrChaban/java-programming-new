package day12_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {
        int speedLimit = 55;
        int currentSpeed = 45;

        System.out.println(currentSpeed > speedLimit);
        System.out.println(speedLimit < currentSpeed);

        System.out.println(speedLimit == currentSpeed);

        boolean isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding? - " + isSpeeding);

        currentSpeed += 20;

        isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding? - " + isSpeeding);
        System.out.println(speedLimit < currentSpeed);

        System.out.println(speedLimit == currentSpeed);


        double accountBalance = 250.25;
        double itemPrice = 200.99;
        System.out.println("Can i afford? - " + (accountBalance >= itemPrice));

        boolean canAfford =  accountBalance >= itemPrice;
        System.out.println("Can i afford? - " + canAfford);

        accountBalance -= itemPrice;
        System.out.println(accountBalance);

        boolean isBroke = accountBalance <=0;
        System.out.println(isBroke);


    }
}
