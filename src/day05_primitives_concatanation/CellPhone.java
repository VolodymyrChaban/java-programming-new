package day05_primitives_concatanation;

public class CellPhone {
    public static void main(String[] args) {
        String brand = "Apple";
        String model = "iphone  11";
        String color = "Black";
        double price = 699.0;
        int storage = 256;
        boolean hasCamera = true;

        System.out.println(brand);
        System.out.println(model);
        System.out.println(color);
        System.out.println(price);
        System.out.println(storage);
        System.out.println(hasCamera);

        System.out.println("brand is " + brand);
        System.out.println("Model is " + model);
        System.out.println("color is " + color);
        System.out.println("price is $" + price);
        System.out.println("Storage is " + storage + "GB");
        System.out.println("Has camera? - " + hasCamera);
    }
}