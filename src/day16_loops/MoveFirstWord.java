package day16_loops;

import java.util.Scanner;

public class MoveFirstWord {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.print("Please enter a sentence: ");

        String sentence = key.nextLine().trim();

         // Take the part from sentence - .substring(0, IndexOfFirstSpace)
        //                     How do I get indexOfFirstSpace? --> .indexOf(" ");

        // int indexOfFirstSpace = sentence.indexOf(" ");
        // String firstWord = sentence.substring(0, indexOfFirstSpace);

        String firstWord = sentence.substring(0, sentence.indexOf(" "));
        String restOfSentence = sentence.substring(sentence.indexOf(" ") + 1); // getting i letter after space
        //String restOfSentence = sentence.substring(sentence.indexOf(" ")).trim(); // is a fun language  --> another way of doing it instead of line 20



        System.out.println(restOfSentence + " " + firstWord); // uniting both strings together "is fun language" + "Java"













    }
}
