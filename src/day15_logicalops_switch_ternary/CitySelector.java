package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Tampa";
        if (city.equals("Moscow") && city.equals("Tampa")) {
            System.out.println("I will move " + city);
        } else {
            System.out.println("Not move " + city);
        }
        String teacher = "Nadir";
        if (teacher.equals("Saim") || teacher.equals("Murodil")) {
            System.out.println("Its java claas with " + teacher);
        } else {
            System.out.println("Soft skill class with " + teacher);
        }


        teacher = "Mueradil";

        if (teacher.equals("Saim") || teacher.equals("Murodil")) {
            System.out.println("Java class with " + teacher);
        } else if (teacher.equals("Nadir")) {
            System.out.println("Soft skill class with " + teacher);
        } else {
            System.out.println("Some class with " + teacher);
        }

        if (teacher.equals("Saim") && teacher.equals("Murodil")) {
            System.out.println("Java class with " + teacher);
        } else if (teacher.equals("Nadir")) {
            System.out.println("Soft skill class with " + teacher);
        } else {
            System.out.println("Some class with " + teacher);
        }

        String company = "NadirTech";
        double salary = 110_000;
        if (company.equals("Tesla ") || salary >= 100_000) {
            System.out.println("Accept offer from " + company);
        }else{
            System.out.println("Not accept from " + company);
        }
    }
}