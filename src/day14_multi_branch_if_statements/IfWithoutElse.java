package day14_multi_branch_if_statements;

public class IfWithoutElse {
    public static void main(String[] args) {
        int year = 2020;
        if (year == 2020) {
            System.out.println("Covid pandemic year ");
            System.out.println("wear musk, and keep 6 feet distance");
        }
        System.out.println("Keep coding java");

        String country = "Canada";
        if (country.equals("USA")){
            System.out.println("Washington DC is the capital");
            System.out.println("White house is on Pennsylvania ave");
        }
        System.out.println("Welcome to " + country);
    }
}
