package day27_wrapper_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {

    // ArrayList is Data structure that is part of Collection Framework
    // Compared to Array, the Arraylist the size is flexible
    // ArrayList only work with Non-primitive data types
    // We can print ArrayList directly (no special thing needed like in Array)
    // To the get the length of the ArrayList we use size() method
    // to add elements we use add() method to add elements in the end of the ArrayList
    // To get element at specific index we use get() method
    // ArrayList takes more space in memory than regular Array
    // The return type is object

    public static void main(String[] args) {
        //ArrayList <int> numbers = new ArrayList<>(); // ArrayList does not work with primitive data types (int - primitive)
        ArrayList <Integer> numbers = new ArrayList<>(); // Integer - object (non-primitive)// At this line, in my ArrayList there is no elements yet
                                                         // It preserves location for 10, by DEFAULT the capacity of the ArrayList is 10 spaces
        System.out.println(numbers);
        System.out.println(numbers.size()); // Even though the DEFAULT capacity is 10, the size is still 0

//        int []nums = {1,2,3,4};
//        System.out.println(Arrays.toString(nums));
//        // add/assign to Array ----> num[2] = 45;
//        nums[2] = 45;
//        System.out.println(Arrays.toString(nums));


        // add/assign to ArrayList
        numbers.add(40); // added 40 to the end of the ArrayList
        System.out.println(numbers);

        numbers.add(-40); // added -40 to the end of the ArrayList
        System.out.println(numbers);

        numbers.add(50);
        numbers.add(60);
        System.out.println(numbers);

        // In array how do we access each element: nums[index]

        //numbers [1]; - ArrayList it does not work
        System.out.println( numbers.get (1) ); // In ArrayList we get specific index this way. It returns elem in index 1 here.
        System.out.println( numbers.get (0) ); // In ArrayList we get specific index this way. It returns elem in index 0 here.
        //System.out.println( numbers.get(4)); //  Index 4 out of bounds for length 4

        // How do we know the number of the total elements in ArrayList
        // Array - nums.length

        System.out.println(numbers.size()); // this is to find out the number of elements in ArrayList. We use .size() instead of .length (Array) - regular array

        System.out.println(numbers.add(4)); // returns True, it means "You have successfully added this number into the end of the Arraylist"
        System.out.println(numbers);


    }
}
