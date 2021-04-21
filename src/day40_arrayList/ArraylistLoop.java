package day40_arrayList;

import java.util.*;

public class ArraylistLoop {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        System.out.println(nums);
        System.out.println("nums = " + nums.size());
        nums.add(12);
        nums.add(34);
        nums.add(3);
        nums.add(43);
        nums.add(65);
        nums.add(332);
        nums.add(232);
        nums.add(5);
        nums.add(1);
        System.out.println("nums = " + nums);
        nums.remove(0);
        System.out.println("nums = " + nums);
        
        nums.remove(new Integer(3));//remove number
        System.out.println("nums = " + nums);

        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));

        }

        for (int each : nums){
            System.out.print(each  + " ");
        }

        
    }
}
