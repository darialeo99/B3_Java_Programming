package day18_loops;

public class Backwards {
    public static void main(String[] args) {


        // can you print the numbers starting from 20 and print it intil 0 [include 0 as well]

        for (int i = 20; i >= 0 ; i--) {
            System.out.println(i);


        }


        System.out.println("-----");
        String str = "loop";    // I want to print out all char-s starting from the last one , from "p"
        //            0123
        //System.out.println(str.charAt(str.length()-1));  // getting the last character
        for (int i = str.length()-1; i >= 0; i--) {
            System.out.println(str.charAt(i));
        }


        // iteration part is not updated minusing 2 on ea h cycle.
        for (int i = str.length()-1; i >= 0; i-=2) {
            System.out.println(str.charAt(i)); // p - o
        }




    }
}
