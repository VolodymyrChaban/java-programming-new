package OfficeHours.Practice_03_03_2021.Practice_03_08_2021;

public class CasingPractice {
    public static void main(String[] args) {

        byte b = 10;
        short s = b;
        byte b2 = (byte) s;

        double d = 5.3;
        int i = (int) d;
        System.out.println(i);
        System.out.println((double)i);

        float f = 3.54F;
        float f2 = (float)3.54;

        float f3 = 5;
        float f4 = 5.5F;
    }
}
