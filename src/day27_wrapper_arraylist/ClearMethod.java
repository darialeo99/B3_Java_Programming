package day27_wrapper_arraylist;

import java.util.ArrayList;

public class ClearMethod {
    public static void main(String[] args) {

        ArrayList <Integer> nums = new ArrayList<>();
        System.out.println(nums);
        System.out.println(nums.size());
        System.out.println(nums.isEmpty());

         // Added elements
        nums.add(100);
        nums.add(900);
        nums.add(80);
        nums.add(70);

        System.out.println();

        System.out.println(nums);
        System.out.println(nums.size());
        System.out.println(nums.isEmpty()); // False

        System.out.println("Now I clear");
        nums.clear();

        System.out.println();

        System.out.println(nums);
        System.out.println(nums.size());
        System.out.println(nums.isEmpty());

    }
}
