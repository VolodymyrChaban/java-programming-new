package day15_logicalops_switch_ternary;

public class JobOfferSelector {
    public static void main(String[] args) {
        String location = "Miami";
        double salary = 100_000;
        boolean isRemote = true;
        boolean hasBenefits = false;
        if (location.equals("Miami") && salary >= 100_000 && isRemote && hasBenefits) {
            System.out.println("Sure, i will accept this offer");
        }else {
            System.out.println("lets consider another offer or negotiate");
        }
    }
}