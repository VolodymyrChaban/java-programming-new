package day34_void_methods;

public class FirstMethod {
    public static void main(String[] args) {
        displayMessage();
        displayMessage();
        displayMessage();

        for (int i = 0; i <= 100; i++) {
            System.out.print(i + " - " );
            displayMessage();

        }
    }

    public static void displayMessage() {
        System.out.println("Hello B22 Friends!");
    }

    }

