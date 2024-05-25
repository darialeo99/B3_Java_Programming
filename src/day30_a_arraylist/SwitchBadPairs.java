package day30_a_arraylist;

/*
    Given an ArrayList of words switch position for each pair in the List. A pair is an element and the element next to it.
    The given ArrayList will always have an even number of elements so each element will always have a single pair

    Ex:
    Input:
        {"Cat", "in", "the", "hat"}

        There is two pairs:
            "Cat" and "in"
            "the" and "hat"

    Output:
        {"in", "Cat", "hat", "the"}
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwitchBadPairs {
    public static void main(String[] args) {

        ArrayList <String> words = new ArrayList<>(Arrays.asList("Cat" , "in" , "the" , "hat"));

        for (int i = 0; i < words.size(); i+= 2) { // we do +2 since it needs to take "Cat" and "in" in 1 iteration

            Collections.swap(words , i , i + 1);



        }

        System.out.println(words);

    }


}
