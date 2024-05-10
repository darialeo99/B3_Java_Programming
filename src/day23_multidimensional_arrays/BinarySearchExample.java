package day23_multidimensional_arrays;

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {

        int [] nums = {4, 10, 30, 100, 50}; // array must be sorted for BinarySearch method to work

        System.out.println(Arrays.binarySearch(nums, 4));
        System.out.println(Arrays.binarySearch(nums, 100));
        System.out.println(Arrays.binarySearch(nums, 200)); // would be in position 4 + 1 = 5 since it is not there * -1
        System.out.println(Arrays.binarySearch(nums, 50));

        // We can write a code that checks for the first matched / found index
        int num = 10;
        int count = 0;
        for (int i = 0; i < nums.length ; i++) {

            if(nums[i] == num){
                System.out.println("Your first match index: " + i);
                break;
            }else{
                count++;
                System.out.println("There was no match");
            }

        }
        if (count == nums.length){
            System.out.println("There was no match");
        }


    }
}
