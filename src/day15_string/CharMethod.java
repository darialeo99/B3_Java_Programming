package day15_string;

import java.awt.datatransfer.StringSelection;

public class CharMethod {
    public static void main(String[] args) {

        // Every character in a String has index and those indexes starts from 0.

        String str = "loop";
        //            0123 (indexes)
        //            (number of characters -1) To find out the last character
        // count char 4 characters


        System.out.println(str.length()); //4

        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3)); // last character

        char first = str.charAt(0); // The charAt(index); method returns us a SINGLE CHARACTER

        // Run Time Exception
        //System.out.println(str.charAt(4)); // Out of Range Index ---> Exception Error. It gives StringIndexOf Bounds error and nothing in this code runs after

        // Can you give me last character of the String (length-1)

        String longWord = "dksjfksjksjskjfdskfskahgfhds";
        //                 012345678........
        System.out.println(longWord.length());
        System.out.println(longWord.length()-1);
        System.out.println(  longWord.charAt(    longWord.length()-1   )  );

        //Can you get me the last 2nd character
        System.out.println(longWord.charAt(     longWord.length() - 2    )     );

        //Can you get me the last index
        System.out.println("Num of characters:" + longWord.length());
        System.out.println("Last index of String:" + (longWord.length() - 1));
        System.out.println("Last character: " + longWord.charAt(longWord.length() - 1));



        //String str2 = "loopcamp.!"; // str2.length(); ---->10
        //             0123456789

        //String str3 = "Hello World!"; //12
        //             01234567891011



    }
}
