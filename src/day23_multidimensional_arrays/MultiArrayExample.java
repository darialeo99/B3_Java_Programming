package day23_multidimensional_arrays;

import java.util.Arrays;

public class MultiArrayExample {
    public static void main(String[] args) {

        int [] n = {5, 10, 20, 10}; // SINGLE dimensional array
        int [] m = {5, 10, 100, 39, 19}; // SINGLE dimensional array

        int [][] all = {n, m}; // we stored already declared SINGLE arrays into Multidimensional / 2D Array

        System.out.println(all); // will give some hashcode/ memory location for 2D array
        System.out.println(Arrays.toString(all));// will give some hashcode/ memory location for each SINGLE array
        System.out.println(Arrays.deepToString(all));

        System.out.println("------------------");

        int [][] multi = {
                {90, 80, 70},             // single array at 2D array index of 0
                {19, 324, 5646, 23},      // single array at 2D array index of 1
                {234, 324},               // single array at 2D array index of 2
                {65}                      // single array at 2D array index of 3


        };

        System.out.println(multi.length); // 4 because I have 4 single dimenisonal arrays
        System.out.println(multi[0].length); // 3 (the first array has length of 3)
        System.out.println(multi[1].length);
        System.out.println(multi[2].length);
        System.out.println(multi[3].length);

        System.out.println("-------------------");
        System.out.println(multi[1][2]); //5646
        //System.out.println(multi[3][2]); // ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 1

        System.out.println("--------------------");
        System.out.println(multi[1]);
        System.out.println(Arrays.toString(multi[1])); // How to print a whole single array {19, 324, 5646, 23}

    }
}
