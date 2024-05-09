package day22_arrays;

import java.util.Arrays;

public class SortStringExample {
    public static void main(String[] args) {

        String [] arr = {" java" , "Hello", "$Dollar" , "Zell" , "4four", "6six", "Hi", "SIX"};


        // Special chars > numbers > uppercase (A-Z) > lowercase (a-z)
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));







    }
}
