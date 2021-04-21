package day19_class_vs_object_strings;

public class StringStartsEndsWith {
    public static void main(String[] args) {
        String word = "java is sensitive";
        System.out.println(word.startsWith("j"));
        System.out.println(word.startsWith("ja"));
        System.out.println(word.startsWith("jav"));
        System.out.println(word.endsWith("va"));
        System.out.println(word.endsWith("tive"));

        String name = "Irina";
        if (name.endsWith("a")){
            System.out.println("Maybe it is female name");
        }


        String firstName = "Dr. Nadir";
        if (firstName.startsWith("Dr.")){
            System.out.println("Dr.Nadir");
        }else if (firstName.startsWith("Mr")){
            System.out.println("Mr Nadir");
        }else if(firstName.startsWith("Ms")){
            System.out.println("Ms Nadir");
        }else {
            System.out.println("Name");
        }


            String url = "www.stock.ru";
            if (url.endsWith(".com")){
                System.out.println("Commercial");
            }else if (url.endsWith(".ru")){
                System.out.println("Russian");
            }else if(url.endsWith(".gov")){
                System.out.println("government");
            }else if (url.endsWith(".edu")){
                System.out.println("Education");
            }else if (url.endsWith(".org")){
                System.out.println("Organisation");
            }else {
                System.out.println("Wrong URL ");
            }

        }



}
