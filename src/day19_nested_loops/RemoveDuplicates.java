package day19_nested_loops;

public class RemoveDuplicates {
    public static void main(String[] args) {

        /*
        Write a program that can remove duplicates from a string
        Ex:  Input abcabbcd
             Output: abcd

         */

        String original = "abcabbcd"; // String literals
        String unique = "";

        // loop though each character
        //    add this each character into another container

        for (int i = 0; i < original.length() ; i++) {     // "abcabbcd" --> 1 --- a   | 2 - b | 3 - c | 4 -a | 5 - a

            char eachLetter = original.charAt(i);         // a |b | c | a | b

            if(!unique.contains("" + eachLetter)){ // contains (""); // unique = "a" | unique = unique(a) + "b" --> "ab" | unique = "abc"
                unique += eachLetter;

            }







        }
        System.out.println("Original: " + original);
        System.out.println("Unique: " + unique);








    }
}
