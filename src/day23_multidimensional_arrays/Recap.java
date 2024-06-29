package day23_multidimensional_arrays;

import java.util.Arrays;

public class Recap {
    public static void main(String[] args) {

        int [] arr = {30,90,60,360,100};
        int [] arr2 = {100,360,60,90,30};

        //how to print arrays
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        System.out.println("Compare before sorting: " + Arrays.equals(arr, arr2));

        Arrays.sort(arr);
        Arrays.sort(arr2);

        System.out.println("Compare after sorting: " + Arrays.equals(arr, arr2));


        System.out.println();
        // how to join the elements of an array

        String [] words = {"java", "selenium", "api" , "db"};

        System.out.println(String.join(" ### ", words));

        //how to convert String into a String Array

        String str = "Today is Thursday";   // str.toCharArray(); ---> char [] ----> ['T', 'o', 'd' ....]
        System.out.println(str.split(" "));
        System.out.println(Arrays.toString(str.split(" ")));

        //how to convert String into a char Array
        System.out.println(str.toCharArray()); // EXCEPTION: This will actually print it as a FULL STRING
        System.out.println(Arrays.toString(str.toCharArray()));




    }
}
