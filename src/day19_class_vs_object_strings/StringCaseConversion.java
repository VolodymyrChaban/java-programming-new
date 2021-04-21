package day19_class_vs_object_strings;

public class StringCaseConversion {
    public static void main(String[] args) {
        String  word = "Cybertek";
        System.out.println(word.toLowerCase());
        System.out.println("JAVA".toLowerCase());

        String company = "Amazon ";
        System.out.println(company.toUpperCase());
        System.out.println("company in upprcase - " + company.toUpperCase());
        System.out.println(("java".toUpperCase() ));

        System.out.println("company = " + company);
        company = company.toUpperCase();
        System.out.println("company = " + company);

    }
}
