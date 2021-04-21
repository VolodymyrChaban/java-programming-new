package day14_multi_branch_if_statements;

public class ChooseLanguage {
    public static void main(String[] args) {
        System.out.println("Choose your language");
        int selection = 2;
        if (selection == 1){
            System.out.println("hello thank you for your call");
        }else if (selection == 2 ){
            System.out.println("Hola");
        }else if (selection == 3){
            System.out.println("merhaba");
        }else if (selection == 4){
            System.out.println("privet");
        }else if (selection ==5){
            System.out.println("merci");
        }else{
            System.out.println("Lets talk java");
        }


    }
}
