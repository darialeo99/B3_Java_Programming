package day28_arraylist;

import java.util.ArrayList;

public class SetMethod {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(500);
        nums.add(800);

        System.out.println(nums);

        nums.set(0, -100); // update the object at the index of 0
        System.out.println(nums);

       // nums.set(5, 400);
        nums.set(nums.size()-1, -900); // update the last index
        System.out.println(nums); // .IndexOutOfBoundsException

        // String example using .set() method

        ArrayList <String> list = new ArrayList<>();
        list.add("java");
        list.add("api");
        System.out.println(list);
        list.set(1, "selenium");
        System.out.println(list);
    }
}
