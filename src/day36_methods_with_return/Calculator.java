package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(add(12, 12));
        double sum = add(2, 3);
        System.out.println("sum = " + sum);
        System.out.println("100.0 = 200.0 " + add(100, 200));

        System.out.println(minus(10, 3));
        System.out.println(multiply(12, 31));
        System.out.println(divide(12,4));

    }

    public static double add(double num1, double num2) {
        double sum = num1 + num2;
        return sum;

    }

    public static double minus(double num1, double num2) {
        double sum = num1 - num2;
        return sum;
    }

    public static double multiply(double num1, double num2) {
        double sum = num1 * num2;
        return sum;
    }

    public static double divide(double num1, double num2) {
        double sum = num1 / num2;
        return sum;
    }
}