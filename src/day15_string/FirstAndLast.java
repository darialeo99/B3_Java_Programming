package day15_string;

import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Enter a sentece: ");
        String sentence = key.nextLine();

        System.out.println(0 + sentence.charAt(0));  // will return int// this is NOT CONCATENATION. CONCETENATION happens if one side is STRING
        System.out.println(sentence.charAt(sentence.length() - 1)); // will return int // HERE We do not have concatenation or addition
        System.out.println(0 + sentence.charAt( sentence.length() - 1));

        System.out.println("First char: " + sentence.charAt(0));
        System.out.println("Last char: " + sentence.charAt(sentence.length() - 1));


        //Java
        //0123
        // .charAt(int)

        //.charAt(3);
        //.charAt(length()-1)



    }
}
