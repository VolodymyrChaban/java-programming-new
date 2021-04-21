package day37_methods_overloading;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(10,5);
        addNumbers(10,5,3,4,5,6,7,3,546,4,455,54);
        addNumbers();
    }
    public static void addNumbers(int... nums){
        int sum = 0;
        for (int n: nums){
            sum +=n;
        }
        System.out.println("sum = " + sum);
    }
}
