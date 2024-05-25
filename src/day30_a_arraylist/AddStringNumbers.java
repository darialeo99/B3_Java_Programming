package day30_a_arraylist;

  /*
        String numbers to sum

        Create a method that will accept an ArrayList of numbers in String format, add each digit of each element and store into a different ArrayList. Return the ArrayList of summed numbers
        Ex:
            Input:
            "123", "34", "513"

            Output:
            [ 6, 7, 9 ]
     */

import java.util.ArrayList;
import java.util.Arrays;

public class AddStringNumbers {


    public static ArrayList <Integer> sumFromString (ArrayList <String> numsToSum){ // "123" , "34" , "513"

        ArrayList <Integer> sums = new ArrayList<>();

        for (String each : numsToSum){ //each is "123"

            int sumOfEach = 0;

            for ( String eachLetter : each.split("") ){ // [ "1" , "2" , "3"]

                sumOfEach +=Integer.parseInt(eachLetter); // "1" ------> 1 and adding this into SumOfEach

            }

            sums.add(sumOfEach); // adding 6 into sums
        }



        return sums;

    }

    public static void main(String[] args) {

        ArrayList <String> list = new ArrayList<>(Arrays.asList( "123", "34" , "3"));
        ArrayList <Integer> summedVersion = sumFromString(list);
        System.out.println(summedVersion);
        System.out.println(sumFromString(list) );

    }

}
