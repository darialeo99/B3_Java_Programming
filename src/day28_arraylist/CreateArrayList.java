package day28_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateArrayList {
    public static void main(String[] args) {

        ArrayList <String> listOne = new ArrayList<>();
        listOne.add("Hello");
        listOne.add("Bye");
        System.out.println(listOne);

        ArrayList <String> listTwo = new ArrayList<>(listOne); // We added elements from listOne to ListTwo// Created bare new Array list with the same elements
        System.out.println(listTwo);
        listTwo.add("Holla"); // only will update ListTwo
        System.out.println();
        System.out.println(listOne);
        System.out.println(listTwo);

        ArrayList <String> listThree = new ArrayList<>(Arrays.asList("One", "Two", "Three"));
        System.out.println(listThree);

        //ArrayList <String> listFour = new ArrayList<>("One", "Two", "Three");  // THIS IS NOT VALID

        // two different objects in different memory locations
//        String str = new String ("Hello");
//        String str2 = new String ("Hello");

        int [] arr2 = {1,2,3};

        //ArrayList <Integer> l5 = new ArrayList<>( Arrays.asList( arr2));
        ArrayList <Integer> l6 = new ArrayList<>( Arrays.asList( convertIntToIntegerArr(arr2)));
    }


    public static Integer [] convertIntToIntegerArr (int [] arr){

        Integer [] objArr = new Integer[arr.length];

        for (int i = 0; i < arr.length ; i++) {

            objArr [i] = arr [i];

        }
        return objArr;
    }

}
