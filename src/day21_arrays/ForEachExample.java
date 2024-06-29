package day21_arrays;

import java.util.Arrays;

public class ForEachExample {
    public static void main(String[] args) {

        //The below are the other options for array declaration.
        //int [] nums = new int[] {3, 4, 5, 7};  // since we have curly brackets with values, in [] we do not need size
        //int [] nums = new int[4] ; // since we DO NOT have curly brackets with values,  in [] we do HAVE TO have size

       int [] nums = {3,4,5,7};

       // This is with traditional loop = or fori loop
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Traditional loop" + nums[i]);

        }


        System.out.println("---------------------------");

        //This is foreach loop
        for ( int eachElem : nums){
            System.out.println("For each" + eachElem);

        }

        System.out.println();

        String [] classes = {"java" , "softskills", "selenium" , "database" , "api"};
        for (String eachElem : classes){
            System.out.println("Foreach loop: " + eachElem);

        }

        System.out.println();

        for (int i = 0; i < classes.length; i++) {
            System.out.println("Traditional loop: " + classes[i]);

        }

        System.out.println();

        double [] nums2 = {23,43,34,2};
        for (double eachElem : nums2){
            System.out.println("Foreach loop: " + eachElem);


        }

        System.out.println();

        for (int i = 0; i < nums2.length; i++) {
            System.out.println("Fori loop: " + nums2[i]);

        }


        System.out.println();

        // The difference between fori and foreach loop when to use.
        String [] names = new String[4];

        for ( String each : names) {
            each = "Test";
        }
        System.out.println(Arrays.toString(names));



        for (int i = 0; i < names.length; i++) {
            names[i] = "Test";
        }
        System.out.println(Arrays.toString(names));


    }
}
