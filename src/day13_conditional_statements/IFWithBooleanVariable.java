package day13_conditional_statements;

public class IFWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = false;
        if (isHungry == true){
            System.out.println("IM hungry ");
        }else{
            System.out.println("Not hungry");
        }
        double price = 130.44;
        boolean isAffordable = price <= 200.0;
        System.out.println("isAffordable = " + isAffordable);
        if (isAffordable){
            System.out.println("I can afford");
        }else {
            System.out.println("To expensive");
        }

        boolean isRemoteJob;
        if (isRemoteJob = true){
            System.out.println("Im interested");
        }else{
            System.out.println("Not interested");
        }
    }
}
