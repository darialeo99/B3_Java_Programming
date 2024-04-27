package day18_loops;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        String sentence = input.nextLine().trim();
        int countSpace = 0;

        // Java is a cool language
        // Solution: countSpace the number of spaces
        //            + 1 ---> total words

        // How can I countSpace how many spaces I have?
        // Go through each character and check if it is equal to space -> if it is increase countSpace

        for (int i = 0; i < sentence.length(); i++) {

            if (sentence.charAt(i) == ' '){ // if ((sentence.charAt(i) + "").equals(" ") ) // if we want to compare string we need to convert  char to String first
                countSpace++;
            }
            //System.out.println(sentence.charAt(i));

        }


        // Hi people   --> 1 space is words
        // Hi nice people  --> 2 spaces means we have 3 words and so on

        System.out.println("There are total " + (countSpace + 1) + " words"); // if you have 1 space in a sentence it means we have 2 words




    }
}
