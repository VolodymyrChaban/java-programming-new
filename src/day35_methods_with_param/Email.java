package day35_methods_with_param;

public class Email {
    public static void main(String[] args) {
        buildEmail("vic","kol");
        buildEmail("vvvvv","gmail");
        buildEmail("John Ward III", "Verizon");
    }
    public static void buildEmail(String name,String domain){
        name = name.replace(" ","_").toLowerCase();
        domain = domain.toLowerCase();
        String  email = name + "@" + domain + ".com";
        System.out.println(email);
    }
}
