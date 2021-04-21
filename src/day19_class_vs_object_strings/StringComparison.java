package day19_class_vs_object_strings;

public class StringComparison {
    public static void main(String[] args) {
        String citi = "Miami";
        //citi.equals("Miami");
        System.out.println(citi.equals("Miami"));
        System.out.println(citi.equals("chicago"));
        System.out.println(citi.equals("Miami "));

        // CASE INSENSITIVE
        System.out.println(citi.equalsIgnoreCase("Miami"));
        System.out.println(citi.equalsIgnoreCase("MIAMI"));
        System.out.println(citi.equalsIgnoreCase("MiAmi"));
        System.out.println(citi.equalsIgnoreCase("Miiami"));//falls
        System.out.println(citi.equalsIgnoreCase("Mi ami"));//falls

        if (citi.equals("Miami")){
            System.out.println("equals() true");
        }else {
            System.out.println("equals() falls");
        }

        if (citi.equalsIgnoreCase("MIAMI")){
            System.out.println("equalsIgnoreCase() true");
        }else {
            System.out.println("equalsIgnoreCase() falls");
        }


    }
}
