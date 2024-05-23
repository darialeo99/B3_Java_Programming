package day28_arraylist;

import java.util.ArrayList;

public class IndexOfMethod {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(100);
        nums.add(500);
        nums.add(800);
        nums.add(100);

        System.out.println(nums);

        // It will find the index of the first match
        System.out.println( nums.indexOf(100) ); // first match is on index 0

        System.out.println( nums.indexOf(400) ); // will return -1 since I do not have 400 in the ArrayList

        int index = nums.indexOf(500);
        System.out.println(index);

        System.out.println(nums.lastIndexOf(100)); // will count index from the end
        nums.remove(nums.lastIndexOf(100)); // will remove the last 100 by index
        System.out.println(nums);

        // Hey, can you update last 100 to be -100

        nums.set(nums.lastIndexOf(100), -100);
        System.out.println(nums);


    }
}
