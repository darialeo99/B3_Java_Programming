package day30_a_arraylist;

/*
        Reverse All

        Create a method that will take an ArrayList of Strings and reverse each element and return an ArrayList of all reversed words
        @param words - Given ArrayList of Strings @return - ArrayList of Strings

        Ex:
            Input: {"ted", "talk", "learn"}
            Output: {"det", "klat", "nrael"}
 */

import day29_arraylist.ArraylistWithMethods;
import my_utilities.StringUtil1;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseAll {

    public static ArrayList <String> reverseAll (ArrayList <String> listToReverse){


        ArrayList <String> reversed = new ArrayList<>();

        for ( String eachElem : listToReverse){

//            String str = "";

//            for (int i = eachElem.length()-1; i >= eachElem.length(); i--) {
//
//                str += eachElem.charAt(i);
//
//            }
//
//            reversed.add(str);

            reversed.add ( StringUtil1.reverse(eachElem));// we have created a method in StringUtil package



        }

        return reversed;


    }

    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>(Arrays.asList("ted", "talk", "learn"));

        System.out.println(list);
        System.out.println(reverseAll(list));


        // Extra (not part of the task)
        System.out.println(ArraylistWithMethods.getDaysOfWeek());

        System.out.println(reverseAll(ArraylistWithMethods.getDaysOfWeek()));
    }

}
