package day38_methods;

public class ArrayUtilsTest {
    public static void main(String[] args) {
        int [] nums = {5,23,1,543,90};
        ArraysUtils.printArray(nums);
        ArraysUtils.printArray(new int[]{23,64,23,534,234,45,234,45});
        System.out.println("sum = " + ArraysUtils.sum(nums));
    }
}
