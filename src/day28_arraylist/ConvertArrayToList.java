package day28_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToList {
    public static void main(String[] args) {

        //Array can work with primitive and non-primitive

        //int [] arr = {1, 2, 3};
        Integer [] arr = {1, 2, 3}; // We made an Integer Array

        Arrays.asList(arr); // Converted the array into a Collection type/ Collection Data Structure (ArrayList)

       // ArrayList <Integer> l1 = Arrays.asList(arr); // This is not valid way to use it
       ArrayList <Integer> l1 = new ArrayList<>(Arrays.asList(arr)); // Created an ArrayList with values from array which was converted into Collection type
        System.out.println(l1);



        // Creating an ArrayList with some initital values

        ArrayList <Integer> l2 = new ArrayList<>(Arrays.asList(12,453,54,67,89)); // Converts Array into the Collection type
        System.out.println(l2);

        ArrayList <String> l3 = new ArrayList <> (Arrays.asList("Java", "Python", "C"));
        System.out.println(l3);




    }
}
