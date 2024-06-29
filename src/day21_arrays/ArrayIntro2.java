package day21_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayIntro2 {
    public static void main(String[] args) {

        double [] arr = new double[4]; // this reserves the spots
        double [] arr2 = {}; // here you would need to provide the elements
        System.out.println(Arrays.toString(arr)); //4 available spaces in array container  --> [0.0, 0.0, 0.0, 0.0] with double datatype. It can hold 4 values
        System.out.println(arr.length);

        arr[0] = 30.99;
        System.out.println(Arrays.toString(arr));

        double price = 1.99;
        int quantity = 5;

        arr[1] = price * quantity;
        System.out.println(Arrays.toString(arr));

        arr[2] = 10.99;
        arr[3] = 50;
        System.out.println(Arrays.toString(arr));

        //reasign the index [0] of the array

        arr[0] = 2000;
        System.out.println(Arrays.toString(arr));

        //System.out.println(arr[4]); // The last index is 3 - ArrayIndexOutofBoundsException: Index 4 our of bounds for length 4

        arr = new double[5]; // I created a bare new array that has 5 spots, the previous array with 4 spots is lost since I reassigned. We can not bring back the old array anymore
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0]); // This will return 0.0 since we can not bring up values from the old array which had 2000.0 value before
        System.out.println(arr.length);
        int arrSize = arr.length;
        System.out.println(arrSize);













        String [] cityName = new String [5];



    }
}
