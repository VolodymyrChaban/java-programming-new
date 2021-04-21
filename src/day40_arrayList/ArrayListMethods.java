package day40_arrayList;

import java.util.*;

public class ArrayListMethods {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        System.out.println("size = " + shoppingList.size());
        System.out.println("isEmpty = " + shoppingList.isEmpty());

        if (shoppingList.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("List is NOT empty");
        }
        shoppingList.add("shoes");
        shoppingList.add("cheep monitor");
        shoppingList.add("mask");
        shoppingList.add("wooden spoon");
        shoppingList.add("scooter");
        shoppingList.add("java book");
        shoppingList.add("tesla");


        if (shoppingList.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("List is NOT empty");
        }

        int count = shoppingList.size();
        System.out.println("Items to buy = " + count);

        System.out.println("is shoes in my list? " + shoppingList.contains("shoes"));

        if(shoppingList.contains("shoes")){
            System.out.println("Contains shoes");
        }else{
            System.out.println("NO shoes ");
        }
        System.out.println("Buying shoes ...  $80");

        shoppingList.remove("shoes");

        System.out.println(shoppingList);

        shoppingList.clear();
        System.out.println("Remove all - " + shoppingList);
    }


}